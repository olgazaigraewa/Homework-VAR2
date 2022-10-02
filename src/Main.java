public class        Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int redPencilsCount = 6;
        System.out.println("Значение переменной redPencilsCount с типом int равно " + redPencilsCount );
        byte whitePencilsCount = 2;
        System.out.println("Значение переменной whitePencilsCount с типом byte равно " + whitePencilsCount );
        short blackPencilsCount = 4;
        System.out.println("Значение переменной blackPencilsCount с типом short равно " + blackPencilsCount );
        long visitorsExpositionCount = 2600000L;
        System.out.println("Значение переменной visitorsExpositionCount с типом long равно " + visitorsExpositionCount );
        float temperatureOfBody = 37.5f;
        System.out.println("Значение переменной temperatureOfBody с типом float равно " + temperatureOfBody );
        double pi = 3.1415926535;
        System.out.println("Значение переменной pi с типом double равно " + pi );

        //Задание 2
        System.out.println("Задание 2");
        float variable1 = 27.12F;
        long variable2 = 987678965549L;
        double variable3 = 2.786;
        boolean variable4 = false;
        char variable5 = 569;
        short variable6 = -159;
        int variable7 = 27897;
        byte variable8 = 67;

        //Задание 3
        System.out.println("Задание 3");
        int studentsInFirstClass = 23;
        int studentsInSecondClass = 27;
        int studentsInThirdClass = 30;
        int papersCount = 480;
        int papersPerStudent = papersCount / (studentsInFirstClass + studentsInSecondClass + studentsInThirdClass);
        System.out.println("На каждого ученика рассчитано " + papersPerStudent + " листов бумаги ");

        //Задание 4
        System.out.println("Задание 4");
        int bottles = 16;
        int minutes = 2;
        int productivityPerMinunte = bottles / minutes;
        int twentyMinutes = 20;
        System.out.println("За " + twentyMinutes + " минут машина произвела бутылок " + productivityPerMinunte * twentyMinutes  + " штук ");
        int minutesInDay = 24 * 60;
        System.out.println("За " + minutesInDay + " минут машина произвела бутылок " + productivityPerMinunte * minutesInDay  + " штук ");
        int minutesInThreeDays = minutesInDay * 3;
        System.out.println("За " + minutesInThreeDays + " минут машина произвела бутылок " + productivityPerMinunte * minutesInThreeDays  + " штук ");
        int minutesInMonth = minutesInThreeDays * 10;
        System.out.println("За " + minutesInMonth + " минут машина произвела бутылок " + productivityPerMinunte * minutesInMonth  + " штук ");

        //Задание 5
        System.out.println("Задание 5");
        int totalCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;
        int totalClasses = totalCans / (whiteCansPerClass + brownCansPerClass);
        int totalWhiteCans = totalClasses * whiteCansPerClass;
        int totalBrownCans = totalClasses * brownCansPerClass;
        System.out.println("В школе, где " + totalClasses + " классов, НУЖНО " + totalWhiteCans + " банок белой краски и " + totalBrownCans  + " банок коричневой краски " );

        //Задание 6
        System.out.println("Задание 6");
        int totalBananas = 5;
        int weightOfOneBanana = 80;
        int weightOfBananas = weightOfOneBanana * totalBananas;
        System.out.println(" Вес бананов " + weightOfBananas + " грамм ");
        int totalMilk = 200;
        int weightOneHundredMillilitersOfMilk = 105;
        int weightOfMilk = weightOneHundredMillilitersOfMilk * (totalMilk / 100);
        System.out.println(" Вес молока " + weightOfMilk + " грамм " );
        int totalIceCreambriquettes = 2;
        int weightOneIceCreambriquettes = 100;
        int weightOfIceCream = weightOneIceCreambriquettes * totalIceCreambriquettes;
        System.out.println( " Вес мороженого " + weightOfIceCream + " грамм " );
        int totalEggs = 4;
        int weightOfOneEggs = 70;
        int weightOfEggs = weightOfOneEggs * totalEggs;
        System.out.println( " Вес яиц " + weightOfEggs + " грамм " );
        int totalGrammsOfSportsBreakfast = weightOfBananas + weightOfMilk + weightOfIceCream + weightOfEggs;
        float totalKilogrammsOfSportsBreakfast = totalGrammsOfSportsBreakfast / 1000f;
        System.out.println("Вес спортивного завтрака " + totalGrammsOfSportsBreakfast + " грамм или " + totalKilogrammsOfSportsBreakfast + " килограмма ");

        //Задание 7
        System.out.println("Задание 7");
        int weightKg = 7;
        int weightGr = weightKg * 1000;
        int oneWayToReduceWeightPerDay = 250;
        int totalOfDayOfOneWay = weightGr / oneWayToReduceWeightPerDay;
        System.out.println(" Если терять в день по " + oneWayToReduceWeightPerDay + " грамм веса  уйдет " + totalOfDayOfOneWay + " дней ");
        int secondWayToReduceWeightPerDay = 500;
        int totalOfDayOfSecondWay = weightGr / secondWayToReduceWeightPerDay;
        System.out.println(" Если терять в день по " + secondWayToReduceWeightPerDay  + " грамм веса  уйдет " + totalOfDayOfSecondWay + " дней ");
        int averageNumberDays = (totalOfDayOfOneWay + totalOfDayOfSecondWay)/2;
        System.out.println(" Чтобы добиться результата похудения в среднем потребуется " + averageNumberDays + " день");

        //Задание 8
        System.out.println("Задание 8 ");
        int MashasSalaryPerMonth = 67760;
        int DenisSalaryPerMonth = 83690;
        int KristinasSalaryPerMonth = 76230;
        int NewMashasSalaryPerMonth = MashasSalaryPerMonth * 10 / 100 + MashasSalaryPerMonth ;
        int growthMashasSalaryPerYear = (NewMashasSalaryPerMonth -MashasSalaryPerMonth) * 12;
        System.out.println( "Маша теперь получает " + NewMashasSalaryPerMonth +  " рублей. Годовой доход вырос на " + growthMashasSalaryPerYear  + " рублей ");
        int NewDenisSalaryPerMonth = DenisSalaryPerMonth * 10 / 100 + DenisSalaryPerMonth ;
        int growthDenisSalaryPerYear = (NewDenisSalaryPerMonth -DenisSalaryPerMonth) * 12;
        System.out.println( "Денис теперь получает " + NewDenisSalaryPerMonth +  " рублей. Годовой доход вырос на " + growthDenisSalaryPerYear   + " рублей ");
        int NewKristinasSalaryPerMonth = KristinasSalaryPerMonth * 10 / 100 + KristinasSalaryPerMonth ;
        int growthKristinasSalaryPerYear = (NewKristinasSalaryPerMonth -KristinasSalaryPerMonth) * 12;
        System.out.println( "Кристина теперь получает " + NewKristinasSalaryPerMonth +  " рублей. Годовой доход вырос на " + growthKristinasSalaryPerYear   + " рублей ");


























    }
}