<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>Model Manager</title>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Model管理工具</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">数据库选择 <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <#list allDataBaseL as dataBase>
                            <li><a class="data_base_link">${dataBase}</a></li>
                        </#list>
                    </ul>
                </li>
                <li><a><span class="label label-info">当前：</span></a></li>
                <li><a class="active data_base_text" href="#">${dataBaseName}</a></li>
            </ul>
            <form class="navbar-form navbar-left">
                <div class="form-group">
                    <input type="text" class="form-control" id="table_name_query" placeholder="输入表名">
                </div>
                <button class="btn btn-default" id="table_name_search">查询</button>
            </form>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#">数据库：</a></li>
                <li><a href="#">Link</a></li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
<div class="container-fluid">
    <div class="row">
        <div class="col-md-3">
            <label for="basic-url">自动增长id设置</label>
            <div class="input-group">
                <input type="text" class="form-control" value="${autoIncrementIdSet}" data-toggle="tooltip" data-placement="top" title="自动增长id设置，多个中间以逗号分隔，如 bd_%,tpm_%; 如果以某个字段开头或者结尾，则加上%，比如 br_% 是以bd_ 开头， %emp 是以 emp 结尾; 如果全部负责则写入全部的表名称">
            </div>
        </div>
        <div class="col-md-9">
            <div class="btn-group" role="group" aria-label="...">
                <button type="button" id="pandora_style_btn" class="btn btn-default">Pandora风格</button>
                <button type="button" id="bd_style_btn" class="btn btn-default">BD表风格</button>
            </div>
        </div>
    </div>
    <hr>
    <div class="row">
        <div class="col-md-3">
            <div id="table_div" class="list-group" style="overflow-y:scroll; width:400px; height:800px;">
            </div>
        </div>
        <div class="col-md-7" id="model_info">
            <!-- Nav tabs -->
            <ul class="nav nav-tabs" role="tablist" id="text_nav">
                <#if tableName??>
                    <li role='presentation' class='active'><a href='#xxx_java' aria-controls='xxx_java' role='tab' data-toggle='tab'>${tableName}.java</a></li>
                    <li role='presentation'><a href='#xxx_reader_java' aria-controls='xxx_reader_java' role='tab' data-toggle='tab'>${tableName}Reader.java</a></li>
                    <li role='presentation'><a href='#xxx_writer_java' aria-controls='xxx_writer_java' role='tab' data-toggle='tab'>${tableName}Writer.java</a></li>
                    <li role='presentation'><a href='#reader_xxx_xml' aria-controls='reader_xxx_xml' role='tab' data-toggle='tab'>reader/${tableName}.xml</a></li>
                    <li role='presentation'><a href='#writer_xxx_xml' aria-controls='writer_xxx_xml' role='tab' data-toggle='tab'>writer/${tableName}.xml</a></li>
                    <li role='presentation'><a href='#xxx_service_java' aria-controls='xxx_service_java' role='tab' data-toggle='tab'>${tableName}Service.java</a></li>
                    <li role='presentation'><a href='#xxx_serviceImpl_java' aria-controls='xxx_serviceImpl_java' role='tab' data-toggle='tab'>${tableName}ServiceImpl.java</a></li>
                <#else>
                    不支持的表！
                </#if>
            </ul>

            <!-- Tab panes -->
            <div class="tab-content">
                <#if tableName??>
                    <div role="tabpanel" class="tab-pane active" id="xxx_java">
                        <pre>
                            <#include "../dbtools/model.ftl">
                        </pre>
                    </div>
                    <div role="tabpanel" class="tab-pane" id="xxx_reader_java">
                        <pre>
                            <#include "../dbtools/reader.ftl">
                        </pre>
                    </div>
                    <div role="tabpanel" class="tab-pane" id="xxx_writer_java">
                        <pre>
                            <#include "../dbtools/writer.ftl">
                        </pre>
                    </div>
                    <div role="tabpanel" class="tab-pane" id="reader_xxx_xml">
                        <pre>
                            <xmp>
                                <#include "../dbtools/readerXml.ftl">
                            </xmp>
                        </pre>
                    </div>
                    <div role="tabpanel" class="tab-pane" id="writer_xxx_xml">
                        <pre>
                            <xmp>
                                <#include "../dbtools/writerXml.ftl">
                            </xmp>
                        </pre>
                    </div>
                    <div role="tabpanel" class="tab-pane" id="xxx_service_java">
                        <pre>
                            <#include "../dbtools/service.ftl">
                        </pre>
                    </div>
                    <div role="tabpanel" class="tab-pane" id="xxx_serviceImpl_java">
                        <pre>
                            <#include "../dbtools/serviceImpl.ftl">
                        </pre>
                    </div>
                </#if>
            </div>
        </div>
        <div class="col-md-2" id="model_style_div">
        </div>
    </div>
</div>



<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<script>
    dataBaseName = "${dataBaseName}";
    autoIncrementIdSet = "${autoIncrementIdSet}";
    $(function () {
        initTableNames("");
        pandoraModelStyle();
//        $("#model_info").hide();

        $(".data_base_link").click(function () {
            console.log($(this).text());
            var database = $(this).text();
            window.location.href = "/?db=" + database;
        });

        $("#table_name_search").click(function(event) {
            event.preventDefault();
//            console.log($("#table_name_query").val());
            initTableNames($("#table_name_query").val());
        });

        $("#autoIncrementIdSet_input").blur(function () {
            changeAutoIncrementIdSet($("#autoIncrementIdSet_input").val())
        });

        $("#pandora_style_btn").click(function () {
            pandoraModelStyle();
        });

        $("#bd_style_btn").click(function () {
            bdModelStyle();
        });

        $('#text_nav a').click(function (e) {
            e.preventDefault()
            $(this).tab('show')
        })

    })

    function initTableNames(tableName) {
        var name = tableName || "";
        $.ajax({
            type: "POST",
            url: "/requireTableNames",
            data: {
                db: dataBaseName,
                name: name,
            },
            success: function(data) {
                var html = "";
                for(var o in data) {
                    html += "<a target=\"table_info_iframe\" href='javascript:getInfoFromTableName(\"" + data[o] + "\");'><button type='button' class='list-group-item'>" + data[o] + "</button></a>";
                }
                $("#table_div").empty();
                $("#table_div").append(html);
//                console.log(html)
            }
        });
    }

    function changeAutoIncrementIdSet(set) {
        $.ajax({
            type: "POST",
            url: "/changeAutoIncrementIdSet",
            data: {
                set: set,
            },
            success: function(data) {
                $("#autoIncrementIdSet_input").val(data);
            }
        });
    }

    function createModelStyleTable(json) {
        var html = "";
        html += "<table class=\"table\">";
        for(var o in  json) {
            html += "<tr>";
            html += "<td>" + o + "</td>";
            html += "<td>" + json[o] + "</td>";
            html += "</tr>";
        }
        html += "</table>";
        return html;
    }

    function pandoraModelStyle() {
        $.ajax({
            type: "GET",
            url: "/modelStyle/pamdora",
            success: function(data) {
                var html = createModelStyleTable(data);
                $("#model_style_div").empty().append(html);
            }
        });
    }

    function bdModelStyle() {
        $.ajax({
            type: "GET",
            url: "/modelStyle/bd",
            success: function(data) {
                var html = createModelStyleTable(data);
                $("#model_style_div").empty().append(html);
            }
        });
    }

    function getInfoFromTableName(tableName) {
        console.log(tableName);
        window.location.href = "/?tableName=" + tableName;
//        $.ajax({
//            type: "POST",
//            url: "/table/" + tableName + "/info",
//            success: function(data) {
//                console.log(data);
//                var html = "";
//                html += "<li role='presentation' class='active'><a href='#xxx_java' aria-controls='xxx_java' role='tab' data-toggle='tab'>" +data.className+ ".java</a></li>";
//                html += "<li role='presentation'><a href='#xxx_reader_java' aria-controls='xxx_reader_java' role='tab' data-toggle='tab'>" +data.className+ "Reader.java</a></li>";
//                html += "<li role='presentation'><a href='#xxx_writer_java' aria-controls='xxx_writer_java' role='tab' data-toggle='tab'>" +data.className+ "Writer.java</a></li>";
//                html += "<li role='presentation'><a href='#reader_xxx_xml' aria-controls='reader_xxx_xml' role='tab' data-toggle='tab'>reader/" +data.className+ ".xml</a></li>";
//                html += "<li role='presentation'><a href='#writer_xxx_xml' aria-controls='writer_xxx_xml' role='tab' data-toggle='tab'>writer/" +data.className+ ".xml</a></li>";
//                html += "<li role='presentation'><a href='#xxx_service_java' aria-controls='xxx_service_java' role='tab' data-toggle='tab'>" +data.className+" Service.java</a></li>";
//                html += "<li role='presentation'><a href='#xxx_serviceImpl_java' aria-controls='xxx_serviceImpl_java' role='tab' data-toggle='tab'>" +data.className+" ServiceImpl.java</a></li>";
////                html += "<li role=\"presentation\" class=\"text_nav_li\"><a href=\"#\">"+data.className+".java</a></li>";
////                html += "<li role=\"presentation\" class=\"text_nav_li\"><a href=\"#\">"+data.className+"Reader.java</a></li>";
////                html += "<li role=\"presentation\" class=\"text_nav_li\"><a href=\"#\">"+data.className+"Writer.java</a></li>";
////                html += "<li role=\"presentation\" class=\"text_nav_li\"><a href=\"#\">reader/"+data.className+".xml</a></li>";
////                html += "<li role=\"presentation\" class=\"text_nav_li\"><a href=\"#\">writer/"+data.className+".xml</a></li>";
////                html += "<li role=\"presentation\" class=\"text_nav_li\"><a href=\"#\">"+data.className+"Service.java</a></li>";
////                html += "<li role=\"presentation\" class=\"text_nav_li\"><a href=\"#\">"+data.className+"ServiceImpl.java</a></li>";
//                $("#text_nav").empty().append(html);
//                $("#text_nav").show();
//            }
//        });
//        parent.location.href="/model?tableName=" + tableName;
    }
</script>
</body>
</html>