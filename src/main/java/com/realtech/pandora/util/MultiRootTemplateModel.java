package com.realtech.pandora.util;

import freemarker.template.ObjectWrapper;
import freemarker.template.TemplateHashModel;
import freemarker.template.TemplateModel;
import freemarker.template.TemplateModelException;

public class MultiRootTemplateModel implements TemplateHashModel {
	
	private TemplateHashModel[] models; 
	
	public MultiRootTemplateModel(Object o) throws TemplateModelException {
		Object[] roots = (Object[]) o;
		models = new TemplateHashModel[roots.length];
		for (int i=0; i<models.length; i++)
			models[i] = (TemplateHashModel) ObjectWrapper.DEFAULT_WRAPPER.wrap(roots[i]);
	}
	
	public boolean isEmpty() throws TemplateModelException {
		for (TemplateHashModel model : models)
			if (!model.isEmpty()) return false;
		return true;
	}
	
	public TemplateModel get(String arg0) throws TemplateModelException {
		TemplateModelException ex = null;
		for (TemplateHashModel model : models)
			try {
				TemplateModel tmp = model.get(arg0);
				if (tmp != null)
					return tmp;
			} catch (TemplateModelException e) {
				ex = e;
			}
		if (ex != null)
			throw ex;
		else
			return null;
	}

}
