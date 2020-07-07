var modal = document.getElementById("modal");


var btn = $(document.getElementById("addButton"));




var file = document.getElementById("file");




btn.click( function() {
    modal.style.display = "flex";

});



// When the user clicks anywhere outside of the modal, close it
window.onclick = function(e) {
    console.log($(e.target).parents("#modal").length);
    if($(e.target).context!=btn.context && modal.style.display=="flex" && (e.target)!=modal && !$(e.target).parents("#modal").length){
        modal.style.display = "none";
    }




}

file.addEventListener("change",handleFiles,false)

function handleFiles(){

    document.getElementById("fileUploadLabel").innerHTML=(this.files[0].name);
}