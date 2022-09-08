/**打开页面就显示实时时间*/
setInterval("showTime()", "1000");




function popAlert1() {
    x = document.getElementById("AlertButton")        // 找到元素
    alert("大哥问你话呢，看到我了没？");
}

function popAlert2() {
    x = document.getElementById("AlertButton")        // 找到元素
    alert("这是我大哥");
}

/**实现点击saber变chicken，点击chicken变saber*/
function changeImg2RunningChicken(thisElement) {
    if (thisElement.getAttribute("src") == "img/saber.jpg") {
        thisElement.src = "img/runningChicken.gif";
    } else {
        thisElement.src = "img/saber.jpg";
    }
}


/*
function myf() {
    xx = { sites: [{ "name": "runoob" }, { "alexa": 10000 }, { "site": "www.runoob.com" }] };
    // var obj = JSON.parse('{ "name":"runoob", "alexa":10000, "site":"www.runoob.com" }');
    var obj = JSON.parse(xx);
    document.getElementById("demo").innerHTML = xx.sites;  //parse()如何解析大的JSON？？？
}
*/


function changeHTML_way1() {
    x = document.getElementsByClassName("changeablewords");
    x[0].innerHTML = "其实点了还不如不点。";
}

function changeHTML_way2() {
    x = document.getElementsByClassName("changeablewords");
    x[0].innerHTML = "想偷东西是吧？";
}

function showTime() {
    element = document.getElementById("timeGetter");
    element.innerHTML = new Date().toString();
} 