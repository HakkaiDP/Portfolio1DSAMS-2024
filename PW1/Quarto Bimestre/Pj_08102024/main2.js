var num = prompt('Digite um número:');
num = parseInt(numero);
 
var verify = numero % 2;

    if (verify === 0) {
        console.log('O número ' + num + ' é par.');
    }
    
    else {
        console.log('O número ' + num + ' é ímpar.');
    }