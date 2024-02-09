# Gestione Prenotazioni
Questo repository contiene un progetto per la gestione delle prenotazioni di spazi di lavoro all'interno di edifici. Il progetto è strutturato utilizzando il framework Spring Boot e include:

antoniobertuccio.u5w1d5: Il package principale che contiene tutte le classi del progetto.
entities: Contiene le entità del dominio, come utenti, edifici, spazi di lavoro e prenotazioni.
dao: Contiene le interfacce dei Data Access Object (DAO) per l'accesso ai dati nel database.
enums: Contiene le enumerazioni utilizzate nel progetto.
runners: Contiene classi CommandLineRunner per l'esecuzione di operazioni automatiche all'avvio dell'applicazione.
service: Contiene le classi di servizio che forniscono funzionalità di business logic.

## Struttura del DB
![Diagramma del Database](https://github.com/m0n0t0ny/U5-W1-D5/blob/main/src/main/resources/U5-W1-D5.png?raw=true)

##Struttura del Progetto

###Entità
Le entità del dominio rappresentano concetti come utenti, edifici, spazi di lavoro e prenotazioni. Ogni entità è annotata con @Entity per essere gestita da JPA e mappata su una tabella nel database.

### DAO
Le interfacce dei Data Access Object (DAO) definiscono i metodi per l'accesso ai dati relativi alle entità. Utilizzando JpaRepository di Spring Data JPA, forniscono operazioni CRUD predefinite e personalizzate per ogni entità.

### Runners
Le classi CommandLineRunner eseguono operazioni automatiche all'avvio dell'applicazione. Queste classi vengono utilizzate per generare dati di esempio o per avviare processi automatici.

### Service
Le classi di servizio contengono la logica di business dell'applicazione. Queste classi orchestrano le operazioni sui dati e forniscono un'interfaccia tra i controller e i DAO.

### Esecuzione del Progetto
Per eseguire il progetto, è sufficiente eseguire il metodo main della classe GestionePrenotazioni. L'applicazione verrà avviata e sarà pronta per l'uso.
