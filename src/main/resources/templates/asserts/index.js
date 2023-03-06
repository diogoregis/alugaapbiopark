
const divVolante = document.getElementById("volante")



function clicarBotaoLocatario(){
    const dash = fetch('http://localhost:9009/api/v1/locatarios')
    .then(function(responseData) {
        return responseData.json();
    })
    .catch(error => console.log(error))
    
    //TODO

}

function clicarBotaoEdificio(){
    const dash = fetch('http://localhost:9009/api/v1/edificios')
    .then(function(responseData) {
        return responseData.json();
    })
    .catch(error => console.log(error))
    
    //TODO

}

function clicarBotaoAluguel(){
    const dash = fetch('http://localhost:9009/api/v1/alugueis')
    .then(function(responseData) {
        return responseData.json();
    })
    .catch(error => console.log(error))
    

    //TODO
}

function criarLinha(quantidadeDeLinhas){
    divVolante.innerHTML = "Nova Linha"

    //TODO
}