function Calculadora(){
    const n1 = parseFloat(document.getElementById("n1").value);
    const n2 = parseFloat(document.getElementById("n2").value);
    const operation = (document.getElementById("operation").value);
    let result;

    if( isNaN(n1) || isNaN(n2)){
        
        result = "Por favor, digite um valor válido.";
    }
    else{

        switch(operation){
            case "adição":
                result = n1+n2;
                break;
        }
        switch(operation){
            case "subtração":
                result = n1-n2;
                break;
        }
        switch(operation){
            case "multiplicação":
                result = n1*n2;
                break;
        }
        switch(operation){
            case "divisão":
                if(n2 === 0){
                    result = "infinito"
                }
                else{
                result = n1/n2;
                }
                break;   
        }
    }
    
    document.getElementById('result').innerText = "Resultado: " + result;
}