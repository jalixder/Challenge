function encriptar(){
    var frase=document.getElementById("texto").value.toLowerCase();
   
    var texto = frase.replace(/e/mg,"enter");
    var texto = texto.replace(/i/mg,"imes");
    var texto = texto.replace(/a/mg,"ai");
    var texto = texto.replace(/o/mg,"ober");
    var texto = texto.replace(/u/mg,"ufat");

    if (texto.length > 0) {
        document.getElementById("muneco").style.display="none";
        document.getElementById("parrafo").style.display="none";
        document.getElementById("titulo-mensaje").style.display="none";
        document.getElementById("mensaje").style.display="flexbox";
        document.getElementById("mensaje").innerHTML=texto;
        var btn = document.querySelector("#btn-encriptar");                 
    } else{
        alert("POR FAVOR INGRESE ALGUN TEXTO!!!")
    }        
}