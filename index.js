function maiuscula() {
    document.getElementById("input").value =  document.getElementById("input").value.toUpperCase();
}

function minuscula() {
    document.getElementById("input").value =  document.getElementById("input").value.toLowerCase();
}

function primeiraLetraPalavra() {
    var splitStr = document.getElementById("input").value.toLowerCase().split(' ');
    for (var i = 0; i < splitStr.length; i++) {
        splitStr[i] = splitStr[i].charAt(0).toUpperCase() + splitStr[i].substring(1);
    }
    document.getElementById("input").value = splitStr.join(' ');
}

function primeiraLetraFrase() {
    var splitStr = document.getElementById("input").value.toLowerCase().split(' ');
    for (var i = 0; i < 1; i++) {
        splitStr[i] = splitStr[i].charAt(0).toUpperCase() + splitStr[i].substring(1);
    }
    document.getElementById("input").value = splitStr.join(' ');
}