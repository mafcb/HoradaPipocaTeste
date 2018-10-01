package br.usjt.ads.desmob.clienteads18.model;

public class ClienteDAO {

    private static Cliente[] clientes;

    private ClienteDAO(){}

    public static Cliente[] getClientes(){
        if(clientes == null){

            clientes = new Cliente[20];

            clientes[0] = new Cliente(1, "Star Wars VII", "d171215", " JJ Abrams", " 17/12/2015", " Ficção Científica/Fantasia",
                    " A queda de Darth Vader e do Império levou ao surgimento de uma nova força sombria: a Primeira Ordem. Eles procuram o jedi Luke Skywalker, " +
                            "desaparecido. A resistência tenta desesperadamente encontrá-lo antes para salvar a galáxia. Enquanto isso, Rey, uma catadora de lixo, e Finn, um ex- stormtrooper, " +
                            "encontram com Han Solo e sua Millenium Falcon e juntos tentam ajudar a encontrar Luke, antes que seja tarde demais. ", " 97%", " 2,066 Bilhões USD");

            clientes[1] = new Cliente(2,"Star Wars VIII","d141217", " Rian Johnson"  , " 14/12/2017", " Ficção Científica/Fantasia", "A tranquila e solitária vida de Luke Skywalker sofre uma reviravolta quando ele conhece Rey, " +
                    "uma jovem que mostra enormes sinais da Força. " +
                    "Enquanto isso, Líder Snoke, Kylo Ren e General Hux lideram a Primeira Ordem para um ataquem contra a Resistência pela supremacia da galáxia.", " 88%", " 1,321 Bilhão USD");

            clientes[2] = new Cliente(3,"Rei Leão","d080794", " Rob Minkoff", " 08/07/1994", " Animação/Drama Musical", " Um jovem leão, Simba, sente-se culpado pelo assassinato do seu pai, o rei Mufasa, " +
                    " e foge do seu Reino, sem saber que a morte foi causada pelo seu tio Scar para tomar o poder. Já adulto, Simba conta a ajuda de seus amigos Timão e Pumba para recuperar seu lugar no trono e devolver a paz de novo ao Reino.", " 93%", " 968,5 Milhões USD");

            clientes[3] = new Cliente(4,"Toy Story","d221295", " John Lasseter"  , " 22/12/1995", " Animação/Aventura", " Woody é um boneco cowboy que pertence ao jovem Andy. Porém vê sua posição como brinquedo favorito comprometida " +
                    "com a chegada do brinquedo novo, Buzz Lightyear. Achando ser um patrulherio de verdade, Buzz chega para movimentar e muito a vida desses brinquedos, principalmente a de Woody", " 98%", " 373,6 Milhões USD");

            clientes[4] = new Cliente(5,"Vingadores: Guerra Infinita","d260418", " Irmãos Russo", " 26/04/2018", " Fantasia/Ficção Científica","OS Vingadores se unem para combater seu inimigo mais poderoso, o maligno e temível Thanos. " +
                    "Em uma missão para coletar todas as 6 jóais do infinto, Thanos planeja usá-las para colocar em prática sua vontade maléfica sobre sua visão de mundo ideal, exterminar metade da vida de todo o universo.", " 95%", " 2,046 Bilhões USD");

            clientes[5] = new Cliente(6,"Star Wars IV","d181177",  " George Lucas"  , " 18/11/1977", " Ficção Científica/Fantasia", " A princesa Leia é mantida refém pelas forças imperiais comandadas por Darth Vader, o terrível vilão que conquistou a galáxia." +
                    " Luke Skywalker e o capitão Han Solo precisam libertá-la para descobrir uma maneira de destruir a Estrela da Morte e restaurar a liberdade, a paz e a justiça na galáxia.", " 93%", " 775 Milhões USD");

            clientes[6] = new Cliente(7,"Star Wars VI","d061083", " George Lucas", " 06/10/1983", " Ficção Científica/Fantasia", " Uma nova Estrela da Morte está sendo construída e supervisionada pelo imperador. Han Solo e a Princesa Leia " +
                    "são libertados das mãos de Jabba por Luke Skywalker, que só se tornará um Jedi quando destruir Darth Vader, que deseja atraí-lo para o lado sombrio da Força.", " 91%", " 475 milhões USD");

            clientes[7] = new Cliente(8,"Vingadores","d270412", " Joss Whedon"  , " 27/04/2012", " Fantasia/Ficção Científica", " Para deter Loki, Nick Fury, o diretor da SHIELD, reúne os  super-heróis capazes de defender a Terra." +
                    " Homem de Ferro, Capitão América, Hulk, Thor, Viúva Negra e Gavião Arqueiro, formam o time dos sonhos para deter tal perigo, mas precisam aprender a deixar de lados seus egos e a trabalhar em grupo em prol da humanidade.", " 92%", " 1,519 Bilhão USD");

            clientes[8] = new Cliente(9,"Vingadores: Era de Ultron","d230415", " Joss Whedon", " 23/04/2015", " Fantasia/Ficção Científica", " Ao tentar proteger o planeta, Tony Stark constrói uma IA para ajuadar a cuidar da paz mundial. " +
                    "Porém, o projeto acaba dando errado e gera o nascimento de Ultron. Com o destino da Terra em jogo, Os Vingadores se unem mais uma vez para tentar salvar a raça humana da extinção.", " 90%", " 1,405 Bilhão USD");

            clientes[9] = new Cliente(10,"Homem Aranha: De Volta ao Lar","d060717", "Jon Watts"  , " 06/07/2017", " Fantasia/Ação", " Depois de atuar ao lado dos Vingadores, chegou a hora de Peter Parker voltar para a sua vida. " +
                    "Lutando contra pequenos crimes, ele pensa ter encontrado a missão de sua vida quando surge o vilão Abutre. O problema é que a tarefa não será tão fácil como o Homem Aranha imaginava.", " 87%", " 880,2 Milhões USD");

            clientes[10] = new Cliente(11,"Homem de Ferro","d300408", " Jon Favreau", " 30/04/2008", " Fantasia/Ação", " Tony Stark é um bilionário, filantropo e inventor que realiza testes bélicos no exterior, mas quando sequestrado por terroristas " +
                    "é obrigado a construir uma arma devastadora. Ao invés disso, ele constrói uma armadura para fugir dessa prisão. Ao voltar para casa, Stark aprimora a armadura, transformando-se no Homem de Ferro.","94%", " 585,2 Milhões USD");

            clientes[11] = new Cliente(12,"Thor Ragnarok","d261017", " Taika Waititi"  , " 26/10/2017", " Fantasia/Ação", " Thor está preso do outro lado do universo, com seu irmão Loki e com Hulk que ali estava há 2 anos. Ele precisa correr contra o tempo para voltar a Asgard e parar Ragnarok, " +
                    "a destruição premeditada de seu mundo, que nesse momento está nas mãos da poderosa vilã Hela, irmã de Thor.", " 92%", " 854 Milhões USD");

            clientes[12] = new Cliente(13,"Harry Potter e a Pedra Filosofal","d231101", " Chris Columbus", " 23/11/2001", " Fantasia/Ficção", " Harry Potter, um menino órfão que vive com seus tios, descobre em seu aniversário de 11 anos que é filho de dois grandes bruxos. " +
                    "Com isso passa a ser um estudante da famosa escola de Magia e Bruxaria: Hogwarts. Lá conhece seus melhores amigos, Rony e Hermione e juntos começam essa nova jornada cheia de mistérios e perigos.", " 95%", " 974,8 Milhões USD");

            clientes[13] = new Cliente(14,"HP e o Prisioneiro de Askaban","d040604", " Alfonso Cuarón"  , " 04/06/2004", " Fantasia/Ficção", " O terceiro ano de Harry Potter em Hogwarts começa muito mal quando ele descobre que o assassino Sirius Black escapou da prisão de Azkaban e está empenhado em matá-lo. " +
                    "Dementadores são enviados para proteger a escola e Harry precisa urgente de ajuda para se proteger de tal perigo que o espera esse ano.", " 95%", " 796,7 Milhões USD");

            clientes[14] = new Cliente(15,"Harry Potter e o Cálice de Fogo","d251105", " Mike Newell", " 25/11/2005", " Fantasia/Ficção", " Harry retorna para seu quarto ano em Hogwarts. Desta vez, acontece um torneio entre as 3 maiores escola de magia, " +
                    "com um participante selecionado de cada escola pelo Cálice de Fogo. O nome de Harry aparece, e mesmo não estando inscrito por nao poder participar por cauda de sua idade, ele precisa competir mesmo assim em provas completamente desafiadoras e extremamente difíceis.", " 94%", " 896,9 Milhões USD");

            clientes[15] = new Cliente(16,"HP e as Relíquias da Morte Parte 2","d150711", " David Yates"  , " 15/07/2011", " Fantasia/Ficção", " A batalha entre o bem e do mal alcança o mundo dos trouxas. O risco nunca foi tão grande, e ninguém está seguro. " +
                    "Harry, Rony e Hermione mais do que nunca precisam unir suas forças e terminar de destruir as Horcruxes restantes para só assim conseguir enfrentar a batalha final que lhes aguarda, contra o temivel vilão Voldemort.", " 90%", " 1,342 Bilhão USD");

            clientes[16] = new Cliente(17,"Assassinato no Expresso do Oriente","d301117", " Kenneth Branagh", " 30/11/2017", " Drama/Mistério", " Após ocorrer um misterioso assassinato em um luxuoso trem, o famoso detetive Hercule Poirot, que também estava a bordo, precisa correr contra o tempo para resolver o caso." +
                    "Nenhum passageiro demonstra ter cometido tal crime, mas todos se tornam suspeitos, e a partir daí, muitos mistérios ainda estão por serem revelados.", " 87%", " 351,8 Milhões USD");

            clientes[17] = new Cliente(18,"Dragon Ball Z: A Batalha dos Deuses","d111013", " Masahiro Hosoda"  , " 11/10/2013", " Fantasia/Ação", " Bills, o deus da destruição, despertou depois de anos de hibernação. Ao escutar que um Super Saiyajin conseguiu vencer Freeza, Bills vai atrás de Goku e de um suposto Deus Super Saiyajin. " +
                    "Goku precisa se preparar para enfrentar uma força que jamais havia vivenciado.", " 85%", " 52,76 Milhões USD");

            clientes[18] = new Cliente(19,"Dragon Ball Z: O Renascimento de F","d180615", " Tadayoshi Yamamuro",  " 18/06/2015", " Fantasia/Ação", " Remanescentes do exército do vilão Freeza, chegam à Terra em busca das Esferas do Dragão para ressuscitar o seu antigo líder." +
                    "Após voltar a vida, Freeza vai a Terra em busca de vingança, mais forte do que nunca com sua nova forma de Freeza Dourado, porém nao esperava que Goku e Vegeta também tinham uma nova carta na manga, o poderoso Super Saiyajin Blue, a versão Saiyajin do Deus Super Saiyajin. ", " 92%", " 64,8 Milhões USD");

            clientes[19] = new Cliente(20,"Dragon Ball Super: Broly","d141218", " Tatsuya Nagamine"  , " 14/12/2018", " Fantasia/Ação", " Após o término do torneio do poder, e de ter conseguido atingir o Instinto Superior, Goku não quer sossegar e quer terinar ainda mais pra ficar o" +
                    "mais forte possível. Parece que Goku estava presentindo algo, pois surge um poderoso e misterioso novo Saiyajin, que de única informação que se tem a seu respeito é seu nome: Broly. ", " Aguardando Lançamento", " Aguardando Lançamento");

        }

        return clientes;
    }

}
