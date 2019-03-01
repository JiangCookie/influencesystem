
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

$("#add").click(function () {
    window.location.href = "index.html";
});
layui.use('table', function () {
    var table = layui.table;

    table.render({
        elem: '#test'
        , url: 'http://localhost:8083/fault/list.do'
        , toolbar: '#toolbarDemo'
        , title: '用户数据表'
        , cols: [[
            {type: 'checkbox', fixed: 'left'}
            , {field: 'troubleId', title: 'ID', width: 80, fixed: 'left', unresize: true}
            , {field: 'tableName', title: '故障名称', width: 150, edit: 'text'}
            , {field: 'createTime', title: '故障时间', width: 150, edit: 'text'}
            , {field: 'branchId', title: '故障分支', width: 150, templet: '#branchIDtoStr'}
            , {field: 'descipton', title: '故障描述', width: 150}
            , {field: 'troubleState', title: '故障状态', width: 150, templet: '#idToStr'}
            , {fixed: 'right', title: '操作', toolbar: '#barDemo', width: 223}
        ]]
        , page: true
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
        //console.log(obj)
        if (obj.event === 'del') {
            layer.confirm('真的删除行么', function (index) {
                obj.del();
                layer.close(index);
            });
        } else if (obj.event === 'edit') {
            layer.prompt({
                formType: 2
                , value: data.email
            }, function (value, index) {
                obj.update({
                    email: value
                });
                layer.close(index);
            });
        }
    });
});

