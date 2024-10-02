<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Criação de Ficha - D&D 5e</title>
    <link rel="stylesheet" href="resources/styles.css">
    <script>
        // Função para calcular o modificador baseado no valor do atributo
        function calcularModificador(valor) {
            return Math.floor((valor - 10) / 2);
        }

        // Função para atualizar os modificadores conforme os atributos são preenchidos
        function atualizarModificador(idAtributo, idModificador) {
            const valorAtributo = document.getElementById(idAtributo).value;
            const modificador = calcularModificador(valorAtributo);
            document.getElementById(idModificador).textContent = modificador >= 0 ? `+${modificador}` : modificador;
        }
    </script>
</head>
<body>
    
    <header>
        <h1> Criação de Ficha de Personagem - D&D 5e</h1>
        <nav>
            <ul>
                <li><a href="projeto/pag-1.html"><button>Home</button></a></li>
                <hr>
                <li><a href="projeto/Untitled-1.html"><button>Criação</button></a></li>
                <hr>
                <li><a href="/sobre.html"><button>Sobre</button></a></li>
            </ul>
        </nav>
    </header>
    
    <section>
        <form action="/criar_ficha" method="POST">
            <label for="name">Nome do Personagem:</label>
            <input type="text" id="name" name="name" required>

            <label for="class">Classe:</label>
            <select id="class" name="class">
                <option value="sem class">Sem Classe</option>
                <option value="guerreiro">Guerreiro</option>
                <option value="mago">Mago</option>
                <option value="ladino">Ladino</option>
                <option value="paladino">Paladino</option>
                <option value="necromante">Necromante</option>
                <!-- Adicionar outras classes -->
            </select>

            <label for="level">Nível:</label>
            <input type="number" id="level" name="level" min="1" max="20">

            <!-- Força -->
            <span id="mod_strength">+0</span>
            <label for="strength">Força:</label>
            <input type="number" id="strength" name="strength" min="1" max="20" oninput="atualizarModificador('strength', 'mod_strength')">
            
            <!-- Destreza -->
            <span id="mod_dexterity">+0</span>
            <label for="dexterity">Destreza:</label>
            <input type="number" id="dexterity" name="dexterity" min="1" max="20" oninput="atualizarModificador('dexterity', 'mod_dexterity')">
            
            <!-- Constituição -->
            <span id="mod_constitution">+0</span>
            <label for="constitution">Constituição:</label>
            <input type="number" id="constitution" name="constitution" min="1" max="20" oninput="atualizarModificador('constitution', 'mod_constitution')">
            
            <!-- Inteligência -->
            <span id="mod_intelligence">+0</span>
            <label for="intelligence">Inteligência:</label>
            <input type="number" id="intelligence" name="intelligence" min="1" max="20" oninput="atualizarModificador('intelligence', 'mod_intelligence')">
            
            <!-- Sabedoria -->
            <span id="mod_wisdom">+0</span>
            <label for="wisdom">Sabedoria:</label>
            <input type="number" id="wisdom" name="wisdom" min="1" max="20" oninput="atualizarModificador('wisdom', 'mod_wisdom')">
            
            <!-- Carisma -->
            <span id="mod_charisma">+0</span>
            <label for="charisma">Carisma:</label>
            <input type="number" id="charisma" name="charisma" min="1" max="20" oninput="atualizarModificador('charisma', 'mod_charisma')">
            
            <button type="submit">Criar Ficha</button>
        </form>
    </section>
</body>
</html>
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
(Css)

body {
    font-family: Arial, sans-serif;
    background-color: #f4f4f4;
    color: #333;
}

header {
    background-color: #444;
    color: white;
    padding: 10px;
    text-align: center;
}

ul {
   
    display: inline-block;
    padding: 10px 20px;
    text-decoration: none;
    background-color: #5f5f5f; /* Cor de fundo azul */
    color: white;
    border-radius: 5px;
    font-size: 16px;
    border: none;
    transition: background-color 0.3s ease;



    background-color: #ffffff; /* Cor ao passar o mouse */


}
form {
    max-width: 600px;
    margin: 20px auto;
    padding: 20px;
    background-color: #fff;
    border-radius: 8px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

label {
    display: block;
    margin-bottom: 5px;
}

input, select {
    width: 100%;
    padding: 8px;
    margin-bottom: 15px;
    border: 1px solid #ccc;
    border-radius: 4px;
}

button {
    width: 100%;
    padding: 10px;
    background-color: #444;
    color: white;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

button:hover {
    background-color: #555;
}
