
function popAlert1() {
    x = document.getElementById("AlertButton")        // 找到元素
    alert("大哥问你话呢，看到我了没？");
}

function popAlert2() {
    x = document.getElementById("AlertButton")        // 找到元素
    alert("这是我大哥");
}

/* 返回主页 玩不明白 已废弃改用<a>了 */
// function back2home(){
//     x=document.getElementsByClassName("home")
//     window.open("");
// }

// function changeImg2RunningChicken() {
//     elements= document.getElementsByClassName("changableImg");
//     for(i=0;i<elements.length;i++){
//         elements[i].src = "../static/img/runningChicken.gif";
//     } 
// }

function changeImg2RunningChicken() {
    element = document.getElementById("changeable1");
    element = document.getElementById("changeable2");
    element = document.getElementById("changeable3");
    element = document.getElementById("changeable4");
    element.src = "../static/img/runningChicken.gif";

    //这里能不能不写四个函数来实现：“点哪个图片就只有那个图片会变化”呢？
}
