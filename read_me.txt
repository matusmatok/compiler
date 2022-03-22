Programovací jazyk obashuje všetky požadované vlastnosti zo zadania. Moje skromné testy neodhalili žiadne závady, okrem polí stringov, ktoré som preto neimplementoval. 
Urobil som menšiu zmenu čo sa týka polí a to takú, že sú iba jednorozmerné, teda viacrozmerné treba spraviť tak, že vytvoríme pole dlžky n_1 * .. * n_k a potom aj pri prístupe rátame index pseudo pointrovou aritmetikou.
Podarilo sa spraviť aj primitívne orezanie mŕtveho kódu, kde ak po istom(v zmysle certain/inevitable) returne nasledujú nejaké príkazy tak nebudú prekompilované. To že nasledujú po returne može znamenať dve veci.
Prvý prípad je, keď sú ešte v bloku nejaké príkazy po príkaze "vrat" (return).
Druhý prípad, že po bloku, ktorý určite returnuje (konkrétne ak sa niečo vracia v oboch vetvách konštrukcie "ak tak inak") nasledujú v bloku ešte nejaké príkazy.
Ďalšia vec, ktorá sa nikde nespomínala je, že za main funkciu sa berú všetky príkazy v chronologickom poradí, ktoré niesú v tele definície žiadnej funkcie. Inak povedané, všetky príkazy ktoré na vstupe ostanú po vymazaní definícií funkcií.
Funkcia može byť definovaná hocikde medzi príkazmi, okrem vnorenia v inej funkcií. 
Namespace pre mená funkcií je okresaný o mená importovaných funkcií, respektíve ich mien v mojom programovacom jazyku.
Taktiež je možné viacnásobné deklarovanie premennej, pokial niesu v hierarchycky závyslých blokoch. Inak povedané, možeme deklarovať premennú "i", pokial nieje ešte definovaná v žiadnom nadradenom bloku.
Menšia nepríjemnosť. Jazyk nepodporuje príkaz súčasnej deklarácie premennej a priradenia do nej. Je preto nutná postupnost príkazov ako napríklad: 
"int a;
 a = 10; "
Rovnako pre polia.
Dá sa pristupovať na znaky reťazcov (a aj ich meniť) konštrukciou "meno_premennej_typu_string[index]". Tiež je možné reťazce spájať funkciou "spoj".
Výstup kompilátora je na štandartný výstup.


Tu je prepis mojej špecifikácie s detailnejšími vyjadreniam o finálnej implementácií.

1. Podporuje pracu s 2 formátmi celých čísiel. Typ dcis 32-bit celé čísla a typ kcis 8-bitové celé čísla. 
 -splnené, len doplním, že 32 bitové čísla sú so znamienkom a 8-bitové bez znamienka

2. Podporuje prácu s logickými hodnotami typu ph, ktoré možu nadobúdať hodnoty {prauda, loz}, ktoré sú prekladané na kcis, kde 0 == loz a 0 != prauda. 
 - toto som zmenil a ph sa prekladá priamo na i1, ovšem doplnil som sémantiku o menšie výnimky a to také, že ak do premennej typu ph priradíme niečo čo nieje ph, tak sa sa prepočíta na ph bud pri číslach, či je vačšie ako 0, alebo pri stringoch je false ak je to prázdny reťazec.
 
3. Alokacia pamate pomocou funkcie vyhrad(n * velkost typu/ smernika). Alokacia pomocou funkcie uvolni(smernik). Tieto funkcie mozno pouzit explicitne ale napriklad prikaz "dcis x = 10" bude implicitne prelozeny na postupnost alokacie pomocou funkcie vyhrad a priradenia hodnoty na pamatoé miesto.
 - toto som tiež zmenil. Netreba nič allocovať, jednoduché premenné sa ukladajú normálne na stack pri deklarácií (príkazom "dcis a;")a polia sa ukladajú na heap, kde sa príkazom "pole[dlžka];" allocuje na heape patričná pamäť volaním C-čkovskej funkcie.
 
4. Práca s poliami pomocou funkcii vyhrad a uvolni. Implementacia ako v C/C++, teda jeden suvysly blok pamate velkosti n1 * ... *nk * velkost_typu pre potencialne viacrozmerne polia.
 - k tomuto som sa vlasne už vyjadril ako v úvode, tak aj v predchádzajúcej časti.

5. ASCII znaky prekladane na kcis. Retazce ASCII znakov "retaz" implementovane ako pole znakov. retaz si pamata svoju dlzku. Maximalna dlzka retazca 2^32 znakov. Dlzku mozno zistit funkciou dlzka(retaz);
 - ASCII znaky sa C-čkovo prekladajô na kcis, a reťazce sú implementované ako pole znakov, ovšem nepamätajú si svoju dĺžku, treba si ju pamätať externe v premennej.
 
6. Podporuje zakladne aritmeticke operacie na dcis a kcis +,-,_(unárne mínus),*,/,^  a logicke operacie na ph AND, OR, NOT, ==, != a operaciu + na retazcoch pre zretazenie.
 - splnené. Iba doplním, že jazyk podporuje tri úrovne priority operátorov kde umocňenie má najvyššiu, nasledujú multiplikatívne operácie a potom aditívne operácie.
 
7. jednotlivé príkazy ukončené ;
 - splnené
 
8. Konštrukcia pre podmienku formatu: ak (logická podmienka) tak {blok prikazov} inak {blok prikazov}
 - splnené
 
9. konštrukcia pre cyklus formatu: kym (logicka podmienka) {blok prikazov}, kde sa blok prikazov vykonava kym plati podmienka.
 - splnené
 
10. Definicia funkcie vo formáte: funkcia typ_navratovej_hodnoty meno_funkcie( typ1 arg1, .. , typn argn){ telo funkcie}. Navrat hodnoty pomocou prikazu vrat.
 - splnené, iba menšia úprava syntaxe. Za definíciou funkcie nasleduje bodkočiarka. Teda "funkcia typ_navratovej_hodnoty meno_funkcie( typ1 arg1, .. , typn argn){ telo funkcie};"
 
11. Volanie funkcie pomocou mena a parametrov.
 - splnené
 
12. Komentáre blokové vo formáte /* komentar */, ktoré možu zaberať aj viac riadkov.
 - splnené
 
13. Čítanie zo vstupu pomocou funkcii cznak(), ktorá číta 1 ASCII znak, alebo criadok(), ktorá číta riadok po \n, alebo cdcis(), ktorá prečíta nasledujuce 32-bit celé číslo zo vstupu. 
 - splnené
 
13.*. funkcia criadok() si pseudovektorovskym sposobom vzrobi pole požadovanej dlžky.
 - má aj parameter, a to maximálnu dlžku čítaného reťazca.
 
14. Výstup na štandartný výstup pomocu funkcie vypis(retazec) alebo vypisdcis(cislo).
 - splnené