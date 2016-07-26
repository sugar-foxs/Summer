/**
 * Created by gch on 16-7-25.
 */
function a_onmouseover(id,id2)
{
    var bookStoreDiv = document.getElementById(id);
    bookStoreDiv.style.display="block";
    var button = document.getElementById(id2);
    button.style.backgroundColor="white";
}

function a_onmouseout(id,id2)
{
    var bookStoreDiv = document.getElementById(id);
    bookStoreDiv.style.display="none";
    var button = document.getElementById(id2);
    button.style.backgroundColor="whitesmoke";
}