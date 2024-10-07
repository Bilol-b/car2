public class datatype {

    public static void main(String[] args) {
                int number = 123; // Bu yerda sonni kiriting
                System.out.println(convertToWords(number));
            }

            public static String convertToWords(int number) {
                if (number < 0 || number > 999) {
                    return "Noto'g'ri son";
                }

                String[] units = {"", "bir", "ikki", "uch", "to'rt", "besh", "olti", "yetti", "sakkiz", "to'qqiz"};
                String[] tens = {"", "o'n", "yigirma", "o'ttiz", "qirq", "ellik", "oltmish", "yetmish", "sakson", "to'qson"};
                String[] hundreds = {"", "yuz", "ikki yuz", "uch yuz", "to'rt yuz", "besh yuz", "olti yuz", "yetti yuz", "sakkiz yuz", "to'qqiz yuz"};

                int unit = number % 10;
                int ten = (number / 10) % 10;
                int hundred = (number / 100) % 10;

                String result = hundreds[hundred];
                if (ten > 0 || unit > 0) {
                    result += " " + tens[ten];
                    if (unit > 0) {
                        result += " " + units[unit];
                    }
                }

                return result.trim();
            }
        }



