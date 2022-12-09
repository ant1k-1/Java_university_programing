package new_pracs.practice_13.task5;

//Задание 5. (25%) Разработайте класс, который получает строковое
//представление телефонного номера в одном из двух возможных строковых
//форматов:
//+<Код страны><Номер 10 цифр>, например “+79175655655” или
//“+104289652211” или
//8<Номер 10 цифр> для России, например “89175655655”
//и преобразует полученную строку в формат:
//+<Код страны><Три цифры>–<Три цифры>–<Четыре цифры>
public class Task5 {
    static class Tel{
        private String countryCode = "";
        private String firstThree = "";
        private String secondThree = "";
        private String thirdFour = "";

        public Tel(String str){
            if (str.charAt(0) == '+'){
                countryCode += "+";
                str = str.replace("+", "");
            }
            int pos;
            countryCode += str.substring(0, str.length() - 10);
            pos = countryCode.length() - 1;
            firstThree += str.substring(pos, pos+3);
            pos = firstThree.length();
            secondThree += str.substring(pos, pos + 3);
            pos = secondThree.length();
            thirdFour += str.substring(pos, pos + 4);
        }

        @Override
        public String toString() {
            return countryCode + " " + firstThree + " " + secondThree + " " + thirdFour;
        }
    }

    public static void main(String[] args) {
        Tel telephone1 = new Tel("+104289652211");
        System.out.println(telephone1 + "\n");

        Tel telephone2 = new Tel("89175655655");
        System.out.println(telephone2);
    }
}
