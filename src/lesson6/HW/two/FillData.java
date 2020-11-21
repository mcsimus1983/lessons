package lesson6.hw.two;

import java.util.Random;

public class FillData {
    private static String nameList = "Август Августин Авраам Агафон Адонис Акайо Алан Александр Алексей Альберт Альфред Анастасий Анатолий Андрей Анисий Антон Аполлинарий Аполлон Аристарх Аркадий Арсен Арсений Артем Артемий Артур Архип Бенедикт Богдан Болеслав Борис Борислав Бронислав Булат Вадим Валентин Валерий Василий Вениамин Викентий Виктор Вилен Виссарион Виталий Влад Владимир Владислав Владлен Вольдемар Всеволод Вячеслав Гавриил Гарри Геннадий Георгий Герман Глеб Гордей Григорий Давид Даниил Демьян Денис Джеймс Джек Джозеф Дмитрий Добрыня Евгений Евдоким Егор Елисей Ефим Ефрем Ждан Захар Зиновий Зорий Иван Игнатий Игорь Илларион Илья Иннокентий Иосиф Ираклий Итан Казимир Камиль Касьян Ким Кир Кирилл Клим Климент Кондрат Константин Кузьма Лев Леон Леонид Леонтий Лукьян Магдалина Макар Максим Марат Марк Мартин Матвей Мирон Митрофан Михаил Модест Моисей Мухаммед Назар Наум Никанор Никита Никифор Николай Никон Олег Оливер Оскар Павел Парамон Патрик Петр Платон Прохор Райан Раймонд Ренат Рику Ринат Роберт Родион Роман Ростислав Руслан Рустам Рэн Савва Савелий Самсон Самуил Святослав Севастьян Семен Сергей Сора Станислав Степан Такеши Тарас Теодор Терентий Тимофей Тимур Тихон Томас Трофим Фаддей Федор Федот Феликс Филат Филимон Филипп Фома Чарли Эдгар Эдуард Эльдар Эрик Юлиан Юлий Юма Юрий Яков Ямато Ян Ярослав";
    private static String lastName = "Смирнов Иванов Кузнецов Соколов Попов Лебедев Козлов Новиков Морозов Петров Волков Соловьёв Васильев Зайцев Павлов Семёнов Голубев Виноградов Богданов Воробьёв Фёдоров Михайлов Беляев Тарасов Белов Комаров Орлов Киселёв Макаров Андреев Ковалёв Ильин Гусев Титов Кузьмин Кудрявцев Баранов Куликов Алексеев Степанов Яковлев Сорокин Сергеев Романов Захаров Борисов Королёв Герасимов Пономарёв Григорьев Лазарев Медведев Ершов Никитин Соболев Рябов Поляков Цветков Данилов Жуков Фролов Журавлёв Николаев Крылов Максимов Сидоров Осипов Белоусов Федотов Дорофеев Егоров Матвеев Бобров Дмитриев Калинин Анисимов Петухов Антонов Тимофеев Никифоров Веселов Филиппов Марков Большаков Суханов Миронов Ширяев Александров Коновалов Шестаков Казаков Ефимов Денисов Громов Фомин Давыдов Мельников Щербаков Блинов Колесников Карпов Афанасьев Власов Маслов Исаков Тихонов Аксёнов Гаврилов Родионов Котов Горбунов Кудряшов Быков Зуев Третьяков Савельев Панов Рыбаков Суворов Абрамов Воронов Мухин Архипов Трофимов Мартынов Емельянов Горшков Чернов Овчинников Селезнёв Панфилов Копылов Михеев Галкин Назаров Лобанов Лукин Беляков Потапов Некрасов Хохлов Жданов Наумов Шилов Воронцов Ермаков Дроздов Игнатьев Савин Логинов Сафонов Капустин Кириллов Моисеев Елисеев Кошелев Костин Горбачёв Орехов Ефремов Исаев Евдокимов Калашников Кабанов Носков Юдин Кулагин Лапин Прохоров Нестеров Харитонов Агафонов Муравьёв Ларионов Федосеев Зимин Пахомов Шубин Игнатов Филатов Крюков Рогов Кулаков Терентьев Молчанов Владимиров Артемьев Гурьев Зиновьев Гришин Кононов Дементьев Ситников Симонов Мишин Фадеев Комиссаров Мамонтов Носов Гуляев Шаров Устинов Вишняков Евсеев Лаврентьев Брагин Константинов Корнилов Авдеев Зыков Бирюков Шарапов Никонов Щукин Дьячков Одинцов Сазонов Якушев Красильников Гордеев Самойлов Князев Беспалов Уваров Шашков Бобылёв Доронин Белозёров Рожков Самсонов Мясников Лихачёв Буров Сысоев Фомичёв Русаков Стрелков Гущин Тетерин Колобов Субботин Фокин Блохин Селиверстов Пестов Кондратьев Силин Меркушев Лыткин Туров";
    private static final String SUFF = "ович";
    private static String[] profession = {
            "Резчик по камню",
            "Графический дизайнер",
            "Врач-кибернетик",
            "Хирург",
            "Биохимик",
            "Режиссер",
            "Археолог",
            "Астрофизик",
            "Следователь",
            "Авиационный инженер",
            "Дизайнер",
            "Частный детектив",
            "Генетик",
            "Web-дизайнер",
            "Химик-технолог",
            "Пилот",
            "Программист",
            "Инженер-конструктор",
            "Дизайнер ландшафта",
            "Географ",
            "Веб-разработчик",
            "Космонавт",
            "Программист-разработчик",
            "Дизайнер интерьера",
            "Архитектор",
            "Судебный эксперт",
            "Вирусолог",
            "Психотерапевт",
            "Биотехнолог",
            "Анестезиолог",
            "Фотограф",
            "Инженер",
            "Реставратор",
            "Артист кино",
            "Иллюстратор",
            "Биофизик",
            "Специалист по системам безопасности",
            "Градостроитель",
            "Реаниматолог",
            "Кинолог",
            "Художник-живописец",
            "Архитектор-проектировщик",
            "Музыкант",
            "Звукорежиссер",
            "Ландшафтный архитектор",
            "Врач",
            "PR-менеджер",
            "Художник-иллюстратор",
            "Спасатель",
            "Патологоанатом",
            "Актёр",
            "Кондитер",
            "Художник по костюмам",
            "Судья",
            "UX-дизайнер",
            "Mobile-разработчик",
            "Технолог пищевого производства",
            "Ветеринар",
            "Переводчик",
            "Продюсер",
            "Лаборант химического анализа",
            "Молекулярный биолог",
            "Онколог",
            "Бортпроводник (стюардесса)",
            "Прокурор",
            "Инженер-проектировщик",
            "Нейропсихолог",
            "Фотожурналист",
            "Инженер-технолог",
            "Архитектор-реставратор",
            "Гематолог",
            "Психолог",
            "Специалист по стандартизации",
            "Медицинский лабораторный техник",
            "Журналист-международник",
            "Клинический психолог",
            "Арт-директор",
            "Ведущий радио и телевидения",
            "Инженер-строитель",
            "Блогер",
            "Ветеринарный фельдшер",
            "Детский хирург",
            "Астроном",
            "Художник-аниматор",
            "Модельер",
            "Web-программист",
            "Science-художник",
            "Грёбаный стриптизёр",
            "Врач функциональной диагностики",
            "Реставратор живописи",
            "Пластический хирург",
            "Юрист",
            "Пожарный",
            "Международник",
            "Невролог",
            "Пластический хирург",
            "Контент-менеджер",
            "Нанотехнолог",
            "Медицинский технолог",
            "Стоматолог-хирург"
    };
    private static Random rnd = new Random();

    public static String generateName() {
        int namesCount = calculateWords(nameList);
        int lastNamesCount = calculateWords(lastName);
        int i = 0;
        String tmpString = "";

//        System.out.println("namesCount = " + namesCount);
        i = rnd.nextInt(namesCount);
//        System.out.println("i1 = " + i);
        tmpString = getRandomName(nameList, i);

        i = rnd.nextInt(namesCount);
//        System.out.println("i2 = " + i);
        tmpString += " " + getRandomName(nameList, i) + SUFF;

        i = rnd.nextInt(lastNamesCount);
        tmpString += " " + getRandomName(lastName, i);
        return tmpString;
    }

    public static String generateProf() {
        return profession[rnd.nextInt(profession.length)];
    }

    public static String generatePhone() {
        String phone = "+7(";
        phone += String.valueOf(rnd.nextInt(899) + 100);
        phone += ")";
        phone += String.valueOf(rnd.nextInt(899) + 100);
        phone += "-";
        phone += String.valueOf(rnd.nextInt(99));
        phone += "-";
        phone += String.valueOf(rnd.nextInt(99));
        return phone;
    }

    public static String generateEmail() {          //a = 97, z = 122
        String email = "";
        byte chr;
        for (int i = 0; i < 7; i++) {
            email += String.valueOf((char)(rnd.nextInt(26) + 97));
        }
        email += "@corp.ru";
        return email;
    }

    public static int generateSalary() {
        return (rnd.nextInt(300) * 1000);
    }

    public static int generateAge() {
        return (rnd.nextInt(80) + 18);
    }

    private static int calculateWords(String nameList) {
        int spaceCount = 0;
        for (char chr : nameList.toCharArray()) {
            if (chr == ' ')
                spaceCount++;
        }
        return spaceCount;
    }

    private static String getRandomName(String list, int i) {
        int counter = 0;
        int positionStart = 0;
        int positionEnd = 0;
        if (i == 0) {i = 1;}
        for (char chr : list.toCharArray()) {
            positionStart++;
            if (chr == ' ') {
                counter++;
                if (counter == i)
                    break;
            }
        }
        for (int j = positionStart; j < list.toCharArray().length; j++) {
            positionEnd++;
            if (((char)list.charAt(j)) == ' ')
                    break;
        }
//        System.out.println("Начало = " + positionStart + ", Длина = " + positionEnd);
        positionEnd += positionStart - 1;
//        System.out.println("'" + list.substring(positionStart, positionEnd) + "'");

        return list.substring(positionStart, positionEnd);
    }


}
