
$(document).ready(function(){
    $.ajax({
        url: "/user/get_user_info.do",
        type: "POST",
        async: false,
        success: function (res) {
            console.log(res);
            $("#name").html(res.data.username);
        }
    })

});


$("#logg").click(function () {
    $.ajax({
        url: "/user/logout.do",
        type: "GET",
        async: false,
        success: function (res) {
            location = "index";
        }
    })
});
$("#add").click(function () {
    location = "form_basic";
});
layui.use('table', function () {
    var table = layui.table;
    table.render({
        elem: '#test'
        , url: 'http://localhost:8083/fault/list.do'
        ,method: 'POST'
        , toolbar: '#toolbarDemo'
        , title: '用户数据表'
        , cols: [[
            {type: 'checkbox', fixed: 'left'}
            , {field: 'troubleId', title: 'ID', width: 80, fixed: 'left', unresize: true}
            , {field: 'tableName', title: '故障名称', width: 150 }
            , {field: 'createTime', title: '故障时间', width: 150}
            , {field: 'branchId', title: '故障分支', width: 150, templet: '#branchIDtoStr'}
            , {field: 'descipton', title: '故障描述', width: 150}
            , {field: 'troubleState', title: '故障状态', width: 150, templet: '#idToStr'}
        ]]
        ,page: true
        , initSort: {
            field: 'troubleState' //排序字段，对应 cols 设定的各字段名
            ,type: 'asc' //排序方式  asc: 升序、desc: 降序、null: 默认排序
        }
        ,id: 'testReload'
    });



    //搜索
    $('.search').on('click', function(){
        var demoReload = $('#demoReload');
        //执行重载
        table.reload('testReload', {
            page: {
                curr: 1 //重新从第 1 页开始
            }
            ,where: {
                keyWord: demoReload.val()
            }
        });
    });

    //头工具栏事件
    table.on('toolbar(test)', function (obj) {
        var checkStatus = table.checkStatus(obj.config.id);
        switch (obj.event) {
            case 'getCheckData':
                window.location.href = "index.html";
                break;
            case 'getCheckLength':
                var data = checkStatus.data;
                layer.msg('选中了：' + data.length + ' 个');
                break;
            case 'isAll':
                layer.msg(checkStatus.isAll ? '全选' : '未全选');
                break;
        }
        ;
    });


    //监听行工具事件
    table.on('tool(test)', function (obj) {
        var data = obj.data;

        if (obj.event === 'edit') {
            $.ajax({
                url: "/fault/update.do",//要请求的服务器url
                //这是一个对象，表示请求的参数，两个参数：method=ajax&val=xxx，服务器可以通过request.getParameter()来获取
                //data:{method:"ajaxTest",val:value},
                data: {
                    troubleId: data.troubleId,
                    troubleState: 1,
                },
                async: true,   //是否为异步请求
                cache: false,  //是否缓存结果
                type: "POST", //请求方式为POST
                dataType: "json",   //服务器返回的数据是什么类型
                success: function(result){  //这个方法会在服务器执行成功是被调用 ，参数result就是服务器返回的值(现在是json类型)
                    if(result){
                        console.log("success");
                    }else{
                        console.log("false");
                    }
                }
            });
        }
        location.reload();
    });

});

