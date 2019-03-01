function move(id) {
    return document.getElementById(id);
}

function RightMove() {
    let con_data = [];
    let index_data = [];

    //看选中的是哪一个值
    for (let i = 0; i < move("left_").length; i++) {
        if (move("left_").options[i].selected) {
            con_data[con_data.length] = [move("left_").options[i].value, move("left_").options[i].text];
            index_data[index_data.length] = [i];
        }
    }

    for (let i = 0; i < con_data.length; i++) {
        let con_fla = true;
        for (let k = 0; k < move("right_").length; k++) {
            if (con_data[i][0] == move("right_").options[k].value)
                con_fla = false;
        }
        if (con_fla)
            move("right_").options[move("right_").length] = new Option(con_data[i][1], con_data[i][0]);
    }
}

//将右边的数据全部移动到左边，并删除右边的数据
function LeftMove() {
    let con_data = [];
    let index_data = [];

    //看选中的是哪一个值
    for (let i = 0; i < move("right_").length; i++) {
        if (move("right_").options[i].selected) {
            con_data[con_data.length] = [move("right_").options[i].value, move("right_").options[i].text];
            index_data[index_data.length] = [i];
        }
    }

    for (let i = 0; i < con_data.length; i++) {
        let con_fla = true;
        for (let k = 0; k < move("left_").length; k++) {
            if (con_data[i][0] == move("left_").options[k].value)
                con_fla = false;
        }
        if (con_fla)
            move("left_").options[move("left_").length] = new Option(con_data[i][1], con_data[i][0]);
    }

    for (let i = index_data.length - 1; i >= 0; i--) {
        move("right_").removeChild(move("right_").options[index_data[i]]);
    }
}