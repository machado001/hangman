package com.machado001.hangman.data


import android.content.res.Resources

val locale = Resources.getSystem().configuration.locales.get(0)

val allWords: Map<String, Set<String>> = if (locale.language != "pt") {
    mapOf(
        "fruit" to setOf(
            "apple",
            "banana",
            "cherry",
            "orange",
            "grape",
            "watermelon",
            "strawberry",
            "pear",
            "kiwi",
            "mango",
            "pineapple",
            "blueberry",
            "raspberry",
            "peach",
            "plum",
            "coconut",
            "lemon",
            "lime",
            "fig",
            "pomegranate",
            "apricot",
            "avocado",
            "blackberry",
            "cantaloupe",
            "cranberry",
            "date",
            "elderberry",
            "guava",
            "honeydew",
            "jack fruit",
            "kiwifruit",
            "lychee",
            "mandarin",
            "nectarine",
            "olive",
            "papaya",
            "quince",
            "raisin",
            "soursop"
        ),
        "animal" to setOf(
            "cat",
            "dog",
            "elephant",
            "giraffe",
            "lion",
            "tiger",
            "bear",
            "zebra",
            "monkey",
            "hippo",
            "kangaroo",
            "penguin",
            "crocodile",
            "koala",
            "rhinoceros",
            "dolphin",
            "cheetah",
            "jaguar",
            "lemur",
            "ostrich",
            "panda",
            "seal",
            "squirrel",
            "toucan",
            "walrus",
            "wolf",
            "bat",
            "camel",
            "deer",
            "eagle",
            "fox",
            "gorilla",
            "hedgehog",
            "iguana",
            "jellyfish",
            "koala",
            "lobster",
            "meerkat",
            "narwhal",
            "octopus"
        ),
        "country" to setOf(
            "germany",
            "brazil",
            "japan",
            "mexico",
            "australia",
            "india",
            "canada",
            "france",
            "italy",
            "russia",
            "china",
            "spain",
            "united states",
            "united kingdom",
            "south korea",
            "argentina",
            "sweden",
            "netherlands",
            "switzerland",
            "belgium",
            "norway",
            "denmark",
            "portugal",
            "austria",
            "greece",
            "turkey",
            "egypt",
            "south africa",
            "kenya",
            "thailand",
            "new zealand",
            "ireland",
            "poland",
            "israel",
            "singapore",
            "malaysia",
            "indonesia",
            "philippines",
            "colombia",
            "chile"
        ),
        "color" to setOf(
            "red",
            "blue",
            "green",
            "yellow",
            "purple",
            "orange",
            "pink",
            "black",
            "white",
            "brown",
            "gray",
            "silver",
            "gold",
            "cyan",
            "magenta",
            "teal",
            "lime",
            "indigo",
            "maroon",
            "navy"
        ),
        "profession" to setOf(
            "doctor",
            "teacher",
            "engineer",
            "chef",
            "actor",
            "pilot",
            "musician",
            "lawyer",
            "athlete",
            "scientist",
            "writer",
            "artist",
            "architect",
            "dentist",
            "nurse",
            "photographer",
            "veterinarian",
            "programmer",
            "entrepreneur",
            "politician",
            "firefighter",
            "police officer",
            "mechanic",
            "hairdresser",
            "designer",
            "athlete",
            "chef",
            "journalist",
            "electrician",
            "plumber",
            "pharmacist",
            "psychologist",
            "banker",
            "waiter",
            "farmer",
            "salesperson",
            "librarian",
            "postman",
            "caretaker",
            "gymnast"
        ),
        "sport" to setOf(
            "soccer",
            "basketball",
            "tennis",
            "baseball",
            "volleyball",
            "swimming",
            "golf",
            "boxing",
            "cricket",
            "rugby",
            "hockey",
            "badminton",
            "table tennis",
            "athletics",
            "cycling",
            "skiing",
            "surfing",
            "karate",
            "gymnastics",
            "wrestling",
            "running",
            "snooker",
            "fencing",
            "archery",
            "canoeing",
            "rowing",
            "sailing",
            "yoga",
            "climbing",
            "shooting",
            "triathlon"
        ),
        "vehicle" to setOf(
            "car",
            "motorcycle",
            "bicycle",
            "bus",
            "truck",
            "train",
            "boat",
            "ship",
            "airplane",
            "helicopter",
            "scooter",
            "van",
            "taxi",
            "subway",
            "ambulance",
            "firetruck",
            "police car",
            "tractor",
            "bulldozer",
            "crane",
            "forklift",
            "hovercraft",
            "jet ski",
            "moped",
            "rickshaw",
            "segway",
            "skateboard",
            "snowmobile",
            "tricycle",
            "yacht"
        ),
        "music genre" to setOf(
            "pop",
            "rock",
            "jazz",
            "hip-hop",
            "rap",
            "country",
            "blues",
            "reggae",
            "soul",
            "classical",
            "electronic",
            "folk",
            "indie",
            "metal",
            "punk",
            "alternative",
            "dance",
            "latin",
            "funk",
            "gospel",
            "disco",
            "ska",
            "techno",
            "house",
            "grunge",
            "salsa",
            "ballad",
            "experimental",
            "instrumental"
        ),
        "movie genre" to setOf(
            "action",
            "comedy",
            "drama",
            "horror",
            "romance",
            "thriller",
            "adventure",
            "science fiction",
            "fantasy",
            "animation",
            "crime",
            "mystery",
            "documentary",
            "western",
            "historical",
            "war",
            "musical",
            "superhero",
            "family",
            "biography",
            "noir",
            "sports",
            "spy",
            "teen",
            "erotic",
            "satire",
            "silent",
            "zombie",
            "cult"
        ),
        "food" to setOf(
            "pizza",
            "hamburger",
            "sushi",
            "pasta",
            "steak",
            "chicken",
            "salad",
            "soup",
            "sandwich",
            "rice",
            "potato",
            "pancake",
            "ice cream",
            "cake",
            "cookie",
            "chocolate",
            "cheese",
            "bread",
            "fruit",
            "vegetable",
            "noodle",
            "taco",
            "burrito",
            "curry",
            "seafood",
            "sausage",
            "pie",
            "muffin",
            "hot dog",
            "popcorn"
        ),
        "body part" to setOf(
            "head",
            "shoulder",
            "knee",
            "toe",
            "arm",
            "leg",
            "hand",
            "foot",
            "ear",
            "eye",
            "nose",
            "mouth",
            "hair",
            "neck",
            "back",
            "chest",
            "waist",
            "hip",
            "elbow",
            "wrist",
            "finger",
            "thumb",
            "tooth",
            "tongue",
            "lip",
            "chin",
            "heel",
            "ankle",
            "toenail",
            "eyebrow",
            "eyelash"
        ),
        "weather" to setOf(
            "sunny",
            "cloudy",
            "rainy",
            "windy",
            "stormy",
            "snowy",
            "foggy",
            "hot",
            "cold",
            "warm",
            "freezing",
            "humid",
            "dry",
            "wet",
            "thunderstorm",
            "hail",
            "blizzard",
            "tornado",
            "rainbow",
            "sunrise",
            "sunset",
            "drought",
            "hurricane",
            "monsoon",
            "snowflake",
            "lightning",
            "gusty",
            "overcast",
            "muggy",
            "breezy"
        ),
        "instrument" to setOf(
            "guitar",
            "piano",
            "drum",
            "violin",
            "saxophone",
            "trumpet",
            "flute",
            "bass",
            "cello",
            "harp",
            "accordion",
            "trombone",
            "clarinet",
            "ukulele",
            "harmonica",
            "bagpipes",
            "xylophone",
            "maracas",
            "banjo",
            "mandolin",
            "tambourine",
            "oboe",
            "didgeridoo",
            "congas",
            "tabla",
            "synthesizer",
        ),
        "emotion" to setOf(
            "happy",
            "sad",
            "angry",
            "excited",
            "afraid",
            "surprised",
            "bored",
            "nervous",
            "calm",
            "proud",
            "jealous",
            "anxious",
            "confused",
            "grateful",
            "guilty",
            "lonely",
            "shy",
            "embarrassed",
            "hopeful",
            "content",
            "curious",
            "disappointed",
            "envious",
            "frustrated",
            "impatient",
            "joyful",
            "peaceful",
            "satisfied",
            "shocked",
            "sympathetic",
            "tired",
            "worried"
        ),
    )
} else {
//    mapOf(
//        "fruta" to setOf(
//            "maçã",
//            "banana",
//            "cereja",
//            "laranja",
//            "uva",
//            "melancia",
//            "morango",
//            "pêra",
//            "kiwi",
//            "manga",
//            "abacaxi",
//            "mirtilo",
//            "framboesa",
//            "pêssego",
//            "ameixa",
//            "coco",
//            "limão",
//            "lima",
//            "figo",
//            "romã",
//            "damasco",
//            "abacate",
//            "amora",
//            "melão",
//            "cranberry",
//            "tâmara",
//            "amora-preta",
//            "cantalupo",
//            "cranberry",
//            "tâmara",
//            "semente de sabugueiro",
//            "goiaba",
//            "melão",
//            "jaca",
//            "quiabo",
//            "uva passa",
//            "graviola"
//        ),
//        "animal" to setOf(
//            "gato",
//            "cachorro",
//            "elefante",
//            "girafa",
//            "leão",
//            "tigre",
//            "urso",
//            "zebra",
//            "macaco",
//            "hipopótamo",
//            "canguru",
//            "pinguim",
//            "crocodilo",
//            "coalho",
//            "rinoceronte",
//            "golfinho",
//            "guepardo",
//            "onça-pintada",
//            "lemure",
//            "avestruz",
//            "panda",
//            "foca",
//            "esquilo",
//            "tucano",
//            "morsa",
//            "lobo",
//            "morcego",
//            "camelo",
//            "veado",
//            "águia",
//            "raposa",
//            "gorila",
//            "ouriço",
//            "iguana",
//            "água-viva",
//            "coalho",
//            "lagosta",
//            "suricata",
//            "narval",
//            "polvo"
//        ),
//        "país" to setOf(
//            "alemanha",
//            "brasil",
//            "japão",
//            "méxico",
//            "austrália",
//            "índia",
//            "canadá",
//            "frança",
//            "itália",
//            "rússia",
//            "china",
//            "espanha",
//            "estados unidos",
//            "reino unido",
//            "coreia do sul",
//            "argentina",
//            "suécia",
//            "países baixos",
//            "suíça",
//            "bélgica",
//            "noruega",
//            "dinamarca",
//            "portugal",
//            "áustria",
//            "grécia",
//            "turquia",
//            "egito",
//            "áfrica do sul",
//            "quênia",
//            "tailândia",
//            "nova zelândia",
//            "irlanda",
//            "polônia",
//            "israel",
//            "singapura",
//            "malásia",
//            "indonésia",
//            "filipinas",
//            "colômbia",
//            "chile"
//        ),
//        "cor" to setOf(
//            "vermelho",
//            "azul",
//            "verde",
//            "amarelo",
//            "roxo",
//            "laranja",
//            "rosa",
//            "preto",
//            "branco",
//            "marrom",
//            "cinza",
//            "prata",
//            "ouro",
//            "ciano",
//            "magenta",
//            "azul-petróleo",
//            "lima",
//            "índigo",
//            "marrom-avermelhado",
//            "azul-marinho"
//        ),
//        "profissão" to setOf(
//            "médico",
//            "professor",
//            "engenheiro",
//            "chef de cozinha",
//            "ator",
//            "piloto",
//            "músico",
//            "advogado",
//            "atleta",
//            "cientista",
//            "escritor",
//            "artista",
//            "arquiteto",
//            "dentista",
//            "enfermeiro",
//            "fotógrafo",
//            "veterinário",
//            "programador",
//            "empreendedor",
//            "político",
//            "bombeiro",
//            "policial",
//            "mecânico",
//            "cabeleireiro",
//            "designer",
//            "atleta",
//            "chef de cozinha",
//            "jornalista",
//            "eletricista",
//            "encanador",
//            "farmacêutico",
//            "psicólogo",
//            "banqueiro",
//            "garçom",
//            "agricultor",
//            "vendedor",
//            "bibliotecário",
//            "carteiro",
//            "zelador",
//            "ginasta"
//        ),
//        "esporte" to setOf(
//            "futebol",
//            "basquete",
//            "tênis",
//            "beisebol",
//            "vôlei",
//            "natação",
//            "golfe",
//            "boxe",
//            "críquete",
//            "rúgbi",
//            "hóquei",
//            "badminton",
//            "tênis de mesa",
//            "atletismo",
//            "ciclismo",
//            "esqui",
//            "surf",
//            "caratê",
//            "ginástica",
//            "luta livre",
//            "corrida",
//            "sinuca",
//            "esgrima",
//            "arco e flecha",
//            "canoagem",
//            "remo",
//            "velejar",
//            "ioga",
//            "escalada",
//            "tiro",
//            "triatlo"
//        ),
//        "veículo" to setOf(
//            "carro",
//            "motocicleta",
//            "bicicleta",
//            "ônibus",
//            "caminhão",
//            "trem",
//            "barco",
//            "navio",
//            "avião",
//            "helicóptero",
//            "patinete",
//            "van",
//            "táxi",
//            "metrô",
//            "ambulância",
//            "caminhão de bombeiros",
//            "viatura",
//            "trator",
//            "trator de esteiras",
//            "guindaste",
//            "empilhadeira",
//            "aerobarco",
//            "jet ski",
//            "moto",
//            "riquixá",
//            "segway",
//            "skate",
//            "moto de neve",
//            "triciclo",
//            "iate"
//        ),
//        "gênero musical" to setOf(
//            "pop",
//            "rock",
//            "jazz",
//            "hip-hop",
//            "rap",
//            "country",
//            "blues",
//            "reggae",
//            "soul",
//            "clássico",
//            "eletrônica",
//            "folk",
//            "indie",
//            "metal",
//            "punk",
//            "alternativo",
//            "dance",
//            "latino",
//            "funk",
//            "gospel",
//            "disco",
//            "ska",
//            "techno",
//            "house",
//            "grunge",
//            "salsa",
//            "balada",
//            "experimental",
//            "instrumental"
//        ),
//        "gênero de filme" to setOf(
//            "ação",
//            "comédia",
//            "drama",
//            "terror",
//            "romance",
//            "suspense",
//            "aventura",
//            "ficção científica",
//            "fantasia",
//            "animação",
//            "crime",
//            "mistério",
//            "documentário",
//            "ocidental",
//            "histórico",
//            "guerra",
//            "musical",
//            "super-herói",
//            "família",
//            "biografia",
//            "noir",
//            "esportes",
//            "espionagem",
//            "adolescente",
//            "erótico",
//            "sátira",
//            "mudo",
//            "zumbi",
//            "cult"
//        ),
//        "comida" to setOf(
//            "pizza",
//            "hambúrguer",
//            "sushi",
//            "macarrão",
//            "bife",
//            "frango",
//            "salada",
//            "sopa",
//            "sanduíche",
//            "arroz",
//            "batata",
//            "panqueca",
//            "sorvete",
//            "bolo",
//            "biscoito",
//            "chocolate",
//            "queijo",
//            "pão",
//            "fruta",
//            "vegetal",
//            "macarrão",
//            "taco",
//            "burrito",
//            "curry",
//            "frutos do mar",
//            "linguiça",
//            "torta",
//            "muffin",
//            "cachorro-quente",
//            "pipoca"
//        ),
//        "parte do corpo" to setOf(
//            "cabeça",
//            "ombro",
//            "joelho",
//            "dedão",
//            "braço",
//            "perna",
//            "mão",
//            "pé",
//            "orelha",
//            "olho",
//            "nariz",
//            "boca",
//            "cabelo",
//            "pescoço",
//            "costas",
//            "peito",
//            "cintura",
//            "quadril",
//            "cotovelo",
//            "pulso",
//            "dedo",
//            "polegar",
//            "dente",
//            "língua",
//            "lábio",
//            "queixo",
//            "calcanhar",
//            "tornozelo",
//            "unha do pé",
//            "sobrancelha",
//            "cílio"
//        ),
//        "tempo" to setOf(
//            "ensolarado",
//            "nublado",
//            "chuvoso",
//            "ventoso",
//            "tempestuoso",
//            "nevado",
//            "nebuloso",
//            "quente",
//            "frio",
//            "morno",
//            "congelante",
//            "úmido",
//            "seco",
//            "molhado",
//            "tempestade",
//            "granizo",
//            "nevasca",
//            "tornado",
//            "arco-íris",
//            "amanhecer",
//            "entardecer",
//            "crepúsculo",
//            "noite",
//            "dia",
//            "meio-dia",
//            "meia-noite",
//            "aurora boreal",
//            "estrelado",
//            "céu claro",
//            "lua cheia",
//            "lua crescente",
//            "lua minguante",
//            "lua nova",
//            "lua de sangue",
//            "lua azul",
//            "lua de mel"
//        )
//    )
    mapOf(
        "fruta" to setOf(
            "maç-ã",
            "ban-ana",
            "cere-ja",
            "laran-ja",
            "u-va",
            "melanci-a",
            "mor-ango",
            "pêr-a",
            "ki-wi",
            "mang-a",
            "abacaxi-",
            "mir-tilo",
            "frambo-esa",
            "pêsse-go",
            "amei-xa",
            "co-co",
            "lim-ão",
            "lim-a",
            "fi-go",
            "rom-ã",
            "dama-sco",
            "abaca-te",
            "am-ora",
            "mel-ão",
            "cr-anberry",
            "tâm-ara",
            "amora-pre-ta",
            "cant-alupo",
            "cranb-erry",
            "tâm-ara",
            "semente de sabugueiro",
            "goiab-a",
            "mel-ão",
            "jaca-",
            "quiabo-",
            "uva passa-",
            "gravio-la"
        ))
}

