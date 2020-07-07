function checkInput(val){

}

function imageClick(price) {
    console.log(document.getElementById("cost"));
    let num = document.getElementById("name").value;
    num = 225*num;

    let day = price/num;
    let year = parseInt(day/365)
    let month;
    let ans='';
    if(year!=0){
        ans+=year.toString()+"year ";
        month = parseInt((day-(year*365))/30);
        if(month!=0){
            ans+=month.toString()+"month ";
        }
    }
    day = Math.round((day%30));

    if(day!=0){
        ans+=day.toString()+"day";
    }

    if(ans.length==0){
        ans = "At a wink"
    }

//if user doesn't write cigar num
    if(ans[0]=='N'){
        alert("Please write Cigar Num downside")
    }
    else {
        document.getElementById("cost").innerHTML = ans;
    }
}

