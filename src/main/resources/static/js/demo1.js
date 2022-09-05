
function popAlert1(){
    x=document.getElementById("AlertButton")        // 找到元素
    alert("大哥问你话呢，看到我了没？");
}

function popAlert2(){
    x=document.getElementById("AlertButton")        // 找到元素
    alert("这是我大哥");
}

/* 返回主页 玩不明白 已废弃改用<a>了 */
// function back2home(){
//     x=document.getElementsByClassName("home")
//     window.open("");
// }

function changeImg() {
    elements= document.getElementsByClassName("changableImg");
    for(i=0;i<elements.length;i++){
        elements[i].src = "../static/img/runningChicken.gif";
    }
    
}