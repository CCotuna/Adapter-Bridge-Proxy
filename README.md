# Adapter-Bridge-Proxy
Structural Design Patterns

# Adapter (Wrapper)

Adapter e un pattern structural care permite obiectelor cu interfete incompatibile sa colaboreze.
Adaptorului e un obiect special care converteste interfata unui obiect pentru a fi inteleasa de alt obiect.

Mod de functionare:
- Adaptorul primeste o interfata, compatibila cu unul din obiectele existente
- Folosind interfata, obiectul existent poate in siguranta sa apeleze metodele adaptorului
- Cand primeste apelul, adaptorul transmite cererea catre al 2-lea obiect, dar intr-un format cunoscut de cel de-al doilea obiect (format cunoscut lui)

Adaptorul implementeaza interfata unui obiect si il ‘infasoara’(wraps) pe celalalt. 
Se foloseste atunci cand ai o interfata, de care ai nevoie, incompatibila cu restul codului.  

Pros and Cons
- single responsibility principle: poti separa interfata sau codul de conversie al datelor de logica de baza a programului
- open/closed principle: poti introduce noi tipuri de adaptori in program fara a crea buguri in codul existent

- complexitatea codului creste deoarece trebuie sa introduci un nou set de interfete si clase.

---------------------------------------

# Bridge

Bridge este un design structural care iti permite sa imparti clasele o clasa complexa sau un set de clase asemanatoare 
in 2 ierarhii separate - abstraction and implementation - care pot fi dezvoltate independent una de alta.

Folosim Bridge pattern atunci cand vrem sa divizam si organizam o clasa care are variante multiple ale unor functionalitati.
Folosim patternul atunci cand vrem sa extindem o clasa in mai multe clase independente.
Folosim Bridge pattern daca avem in vedere schimbarea implementarii la momentul executiei.

Pros and Cons
- poti crea clase si aplicatii independente de platforme.
- OCP - poti introduce noi abstractions si implementations independente unele de celelalte.
- SRP - poti sa te focusezi pe logica avansata in abstractizare si pe detaliile platformei in implementare

- creste complexitatea codului, cand este aplicat pe o clasa gresit

---------------------------------------

# Proxy

Proxy e un design pattern structural care iti permite sa creezi un subsituent sau placeholder pentru alt obiect. 
Un proxy controleaza accesul la obiectul original, permitandu-ti sa realizezi ceva inainte, sau dupa ce requestul ajunge la obiectul original.

Mod de functionare
- Patternul Proxy creaza o noua clasa cu aceeasi interfata ca un obiect original. Actualizezi aplicatia astfel incat sa transmita obiectul proxy tuturor clientilor obiectului original. La primirea unei cereri de la un client, proxy-ul creeaza un obiect de serviciu real si ii deleaga toata munca.

Aplicatii
- Lazy initialization (virtual proxy) - se aplica in cazul aplicatiilor care consuma resurse, fiind pornita tot timpul chiar daca nu ai nevoie de serviciile sale atunci
  In loc sa se creeze obiectul cand aplicatia este pornita, poti intarzia initializarea obiectului pana in momentul in care are nevoie de el 
    

Pros and Cons
- poti controla obiectul serviciu fara ca clientii sa stie
- poti administra lifecycle ul obiectului seriviciu atunci cand clientilor nu le pasa
- proxy-ul functioneaza chiar si atunci cand obiectul serviciu nu este pregatit sau nu e disponibil
- OCP - se pot introduce noi proxies

- codul poate deveni mult mai complicat din moment ce trebuie sa introducem mai multe clase
- raspunsul serviciului poate fi intarziat
