public class Task_1 {
//  Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder.
//  Данные для фильтрации приведены ниже в виде json строки.
//  Если значение null, то параметр не должен попадать в запрос.
//  Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

    public static void main(String[] args) {
        String enterString = "select * from students where ";
        StringBuilder strRes = new StringBuilder();
        String inputStr = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String newStr = inputStr.replace("\"","")
                .replace("{","")
                .replace("}","");
        String[] st = newStr.split(",");

        for (String item:st) {
            if (!item.contains("null")){
                strRes.append(enterString + item.strip() + "\n");
            }
        }
        System.out.println(strRes);
    }
}
