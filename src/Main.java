public class Main {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Podaj co najmniej trzy liczby do wykonania operacji arytmetycznych.");
            return;
        }

        try {
            double liczba1 = Double.parseDouble(args[0]);
            double liczba2 = Double.parseDouble(args[1]);
            String operator = args[2];

            double wynik = 0;

            switch (operator) {
                case "+":
                    wynik = liczba1 + liczba2;
                    break;
                case "-":
                    wynik = liczba1 - liczba2;
                    break;
                case "*":
                    wynik = liczba1 * liczba2;
                    break;
                case "/":
                    if (liczba2 != 0) {
                        wynik = liczba1 / liczba2;
                    } else {
                        System.out.println("Nie można dzielić przez zero.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Niepoprawny operator. Dostępne operatory to +, -, *, /");
                    return;
            }

            System.out.println("Wynik operacji: " + wynik);
        } catch (NumberFormatException e) {
            System.out.println("Podane argumenty nie są liczbami.");
        }
    }
}
