import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Dipendente> dipendenti = Arrays.asList(
                new DipendenteFullTime(1L,"mario","michelini",3000.20,240),
                new DipendentePart(2L,"Gennaro","Costiglia",8.5,100),
                new DipendentePart(3L,"Francesca","iniazini",8.5,150),
                new DipendenteFullTime(4L,"ernesto","mazzini",2000.20,240),
                new DipendenteFullTime(5L,"priscilla","filiali",3500.20,240)
        );
        System.out.println("La lista dei dipendenti:");
        dipendenti.forEach(System.out::println);

        System.out.println("\nRicerca per id del dipendente:");
        Long idCercato =6L;
        Optional<Dipendente> dipendente = dipendenti.stream()
                .filter(d -> d.getId()==idCercato)
                .findFirst();

        dipendente.ifPresentOrElse(
                d-> System.out.println("Dipendete trovato"),
                () -> System.out.println("Dipendete non trovato")
        );

        System.out.println("\nStipedi maggiori di 2000");
        dipendenti.stream()
                .filter(d-> d.calcolaStipendio()>2000)
                .forEach(System.out::println);

        System.out.println("\n Dipendenti ordinati per cognome");
        dipendenti.stream()
                .sorted(Comparator.comparing(Dipendente::getNome))
                .forEach(System.out::println);

        System.out.println("\nStipendio medio e massimo");
        double stipendiomedio = dipendenti.stream()
                .mapToDouble(Dipendente::calcolaStipendio)
                .average()
                .orElse(0.0);
        System.out.println("Lo stipedio medio è: "+ stipendiomedio);

        double stipendiomassimo= dipendenti.stream()
                .mapToDouble(Dipendente::calcolaStipendio)
                .max()
                .orElse(0.0);
        System.out.println("Lo stipendio massimo è: "+ stipendiomassimo);
    }


}


/*
* creare una gestione dei dipendenti nel seguente modo:
DipendenteFullTime(Long id, String nome, String cognome, double paga, int orario) dove la paga è quella totale
DipendentePart(Long id, String nome, String cognome, double paga, int orario) qui la paga è oraria

creare un'interfaccia con un metodo calcolaStipendio (double)
ed una classe astratta che implementa l'interfaccia contenente costruttore ed attributi nella classe DipendenteFullTime/DipendentePart implementare il metodo astratto

nel Main creare con l'utilizzo del polimorfismo diversi dipendenti

stampare tutti i dipendenti
eseguire la ricerca per id (sufficiente recuperare il primo elemento) e con verifica dell'esistenza di quest'ultimo (optional)
stampare tutti gli stipendi maggiori di 2000
ordinare la lista per cognome e stampare i dipendenti
calcolare lo stipendio medio
recuperare lo stipendio massimo


*
* */