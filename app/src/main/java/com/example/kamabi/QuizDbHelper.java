package com.example.kamabi;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.kamabi.QuizContract.*;

public class QuizDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "MyAwesomeQuiz.db";
    private static final int DATABASE_VERSION = 1;
    private SQLiteDatabase db;
    public QuizDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;
        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuestionsTable.TABLE_NAME + " ( " +
                QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionsTable.COLUMN_NASKAH + " TEXT, " +
                QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionsTable();
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME);
        onCreate(db);
    }
    private void fillQuestionsTable() {
        Question q1 = new Question("المِيَاهُ الَّتِي يَجُوْزُ بِهَا التَّطْهِيْرُ سَبْعُ مِيَاهٍ : مَاءُ السَّمَاءِ، وَمَاءُ الْبَحْرِ، وَمَاءُ النَّهْرِ، وَمَاءُ الْبِئْرِ، وَمَاءُ الْعَيْنِ، وَمَاءُالْبَرَدِ. ثُمَّ الْمِيَاهُ عَلَى أَرْبَعَةِ أَقْسَمٍ : طَاهِرٌ مُطَهِّرٌ غَيْرُ مَكْرُوْهٍ، وَهُوَ الْمَاءُ الْمُطْلَقُ وَطَاهِرٌ مُطَهِّرٌ مَكْرُوْهٌ، وَهُوَ الْمَاءُ الْمُشَمَّسُ. وَطَاهِرٌ غَيْرُ مُطَهِّرٍ، وَهُوَ الْمَاءُ الْمُسْتَعْمَلُ. وَ الْمُتَغَيِّرُ بِمَا خَالَطَهُ مِنَ الطَّهِرَاتِ. وَمَاءٌ نَجِسٌ، وَهُوَ الَّذِي حَلَّتْ فِيْهِ نَجَاسَةٌ، وَهُوَ دُوْنَ الْقُلَّتَيْنِ، أَوْ كَانَ قُلَّتَيْنِ فَتَغَيَّرَ. وَالْقُلَّتَانِ خَمْسُمِائَةِ رِطْلٍ بَغْدَادِيٍّ تَقْرِيْبًا فِيْ الْأصَحِّ.",
                "Apakah Pokok pikiran dalam teks diatas ?",
                "Bab yang menerangkan Sholat", "Bab yang menerangkan tentang Bersuci",
                "Bab yang Menerangkan Zakat","Bab yang menerangkan Haji",
                2);
        addQuestion(q1);
        Question q2 = new Question("المِيَاهُ الَّتِي يَجُوْزُ بِهَا التَّطْهِيْرُ سَبْعُ مِيَاهٍ : مَاءُ السَّمَاءِ، وَمَاءُ الْبَحْرِ، وَمَاءُ النَّهْرِ، وَمَاءُ الْبِئْرِ، وَمَاءُ الْعَيْنِ، وَمَاءُالْبَرَدِ. ثُمَّ الْمِيَاهُ عَلَى أَرْبَعَةِ أَقْسَمٍ : طَاهِرٌ مُطَهِّرٌ غَيْرُ مَكْرُوْهٍ، وَهُوَ الْمَاءُ الْمُطْلَقُ وَطَاهِرٌ مُطَهِّرٌ مَكْرُوْهٌ، وَهُوَ الْمَاءُ الْمُشَمَّسُ. وَطَاهِرٌ غَيْرُ مُطَهِّرٍ، وَهُوَ الْمَاءُ الْمُسْتَعْمَلُ. وَ الْمُتَغَيِّرُ بِمَا خَالَطَهُ مِنَ الطَّهِرَاتِ. وَمَاءٌ نَجِسٌ، وَهُوَ الَّذِي حَلَّتْ فِيْهِ نَجَاسَةٌ، وَهُوَ دُوْنَ الْقُلَّتَيْنِ، أَوْ كَانَ قُلَّتَيْنِ فَتَغَيَّرَ. وَالْقُلَّتَانِ خَمْسُمِائَةِ رِطْلٍ بَغْدَادِيٍّ تَقْرِيْبًا فِيْ الْأصَحِّ.",
                "Ada berapakah air yang boleh digunakan untuk bersuji ?",
                "7", "4", "5","6",
                1);
        addQuestion(q2);
        Question q3 = new Question("المِيَاهُ الَّتِي يَجُوْزُ بِهَا التَّطْهِيْرُ سَبْعُ مِيَاهٍ : مَاءُ السَّمَاءِ، وَمَاءُ الْبَحْرِ، وَمَاءُ النَّهْرِ، وَمَاءُ الْبِئْرِ، وَمَاءُ الْعَيْنِ، وَمَاءُالْبَرَدِ. ثُمَّ الْمِيَاهُ عَلَى أَرْبَعَةِ أَقْسَمٍ : طَاهِرٌ مُطَهِّرٌ غَيْرُ مَكْرُوْهٍ، وَهُوَ الْمَاءُ الْمُطْلَقُ وَطَاهِرٌ مُطَهِّرٌ مَكْرُوْهٌ، وَهُوَ الْمَاءُ الْمُشَمَّسُ. وَطَاهِرٌ غَيْرُ مُطَهِّرٍ، وَهُوَ الْمَاءُ الْمُسْتَعْمَلُ. وَ الْمُتَغَيِّرُ بِمَا خَالَطَهُ مِنَ الطَّهِرَاتِ. وَمَاءٌ نَجِسٌ، وَهُوَ الَّذِي حَلَّتْ فِيْهِ نَجَاسَةٌ، وَهُوَ دُوْنَ الْقُلَّتَيْنِ، أَوْ كَانَ قُلَّتَيْنِ فَتَغَيَّرَ. وَالْقُلَّتَانِ خَمْسُمِائَةِ رِطْلٍ بَغْدَادِيٍّ تَقْرِيْبًا فِيْ الْأصَحِّ.",
                "Berdasarkan sifatnya air dibagi menjadi 4, pernyataan dibawah ini manakah yang termasuk keempat jenis air tersebut ?",
                "Air salju, air sumur, air embun air suci mensucikan makruh.", "Air suci mensucikan tidak makruh, air suci mensucikan makruh, air hujan, air laut.", "Air najis, air suci tidak mensucikan, air suci mensucikan makruh, air sungai.","Air najis, air suci tidak mensucikan, air suci mensucikan makruh, air suci mensucikan tidak makruh.",
                4);
        addQuestion(q3);
        Question q4 = new Question("المِيَاهُ الَّتِي يَجُوْزُ بِهَا التَّطْهِيْرُ سَبْعُ مِيَاهٍ : مَاءُ السَّمَاءِ، وَمَاءُ الْبَحْرِ، وَمَاءُ النَّهْرِ، وَمَاءُ الْبِئْرِ، وَمَاءُ الْعَيْنِ، وَمَاءُالْبَرَدِ. ثُمَّ الْمِيَاهُ عَلَى أَرْبَعَةِ أَقْسَمٍ : طَاهِرٌ مُطَهِّرٌ غَيْرُ مَكْرُوْهٍ، وَهُوَ الْمَاءُ الْمُطْلَقُ وَطَاهِرٌ مُطَهِّرٌ مَكْرُوْهٌ، وَهُوَ الْمَاءُ الْمُشَمَّسُ. وَطَاهِرٌ غَيْرُ مُطَهِّرٍ، وَهُوَ الْمَاءُ الْمُسْتَعْمَلُ. وَ الْمُتَغَيِّرُ بِمَا خَالَطَهُ مِنَ الطَّهِرَاتِ. وَمَاءٌ نَجِسٌ، وَهُوَ الَّذِي حَلَّتْ فِيْهِ نَجَاسَةٌ، وَهُوَ دُوْنَ الْقُلَّتَيْنِ، أَوْ كَانَ قُلَّتَيْنِ فَتَغَيَّرَ. وَالْقُلَّتَانِ خَمْسُمِائَةِ رِطْلٍ بَغْدَادِيٍّ تَقْرِيْبًا فِيْ الْأصَحِّ.",
                "<![CDATA[" +
                        "<font color=” #0000FF”> المِيَاهُ</font>" +
                        "الَّتِي يَجُوْزُ بِهَا التَّطْهِيْرُ سَبْعُ مِيَاهٍ" +
                        "]]>\n" +
                        "Lafadz yang bertanda biru merupakan lafadz atau kalimah pembuka pada teks, maka kalimah tersebut memiliki kedudukan sebagai ?",
                "Khobar", "Fail", "Mubtada’","Fi’il",
                3);
        addQuestion(q4);
        Question q5 = new Question("المِيَاهُ الَّتِي يَجُوْزُ بِهَا التَّطْهِيْرُ سَبْعُ مِيَاهٍ : مَاءُ السَّمَاءِ، وَمَاءُ الْبَحْرِ، وَمَاءُ النَّهْرِ، وَمَاءُ الْبِئْرِ، وَمَاءُ الْعَيْنِ، وَمَاءُالْبَرَدِ. ثُمَّ الْمِيَاهُ عَلَى أَرْبَعَةِ أَقْسَمٍ : طَاهِرٌ مُطَهِّرٌ غَيْرُ مَكْرُوْهٍ، وَهُوَ الْمَاءُ الْمُطْلَقُ وَطَاهِرٌ مُطَهِّرٌ مَكْرُوْهٌ، وَهُوَ الْمَاءُ الْمُشَمَّسُ. وَطَاهِرٌ غَيْرُ مُطَهِّرٍ، وَهُوَ الْمَاءُ الْمُسْتَعْمَلُ. وَ الْمُتَغَيِّرُ بِمَا خَالَطَهُ مِنَ الطَّهِرَاتِ. وَمَاءٌ نَجِسٌ، وَهُوَ الَّذِي حَلَّتْ فِيْهِ نَجَاسَةٌ، وَهُوَ دُوْنَ الْقُلَّتَيْنِ، أَوْ كَانَ قُلَّتَيْنِ فَتَغَيَّرَ. وَالْقُلَّتَانِ خَمْسُمِائَةِ رِطْلٍ بَغْدَادِيٍّ تَقْرِيْبًا فِيْ الْأصَحِّ.",
                "Kalimah yang memiliki kedudukan sebagai mubtada’ maka dalam membaca kitab apakah tanda dan makna yang harus diberikan ?",
                "(م)Utawi ", "(خ)Iku", "(ص)Kang","(مف)Ing",
                1);
        addQuestion(q5);
        Question q6 = new Question("النِّكَاحُ مُسْتَحَبٌّ لِمَنْ يَحْتَاجُ إِلَيْهِ. وَيَجُوْزُ لِلْحُرِّ أَنْ يَجْمَعَ بَيْنَ أَرْبَعِ حَرَائِرَ، وَلِلْعَبْدِ بَيْنَ ثْنَتَيْنِ. وَلَا يَنْكِحُ الْحُرُّ أَمَةً إلَّا بِشَرْطَيْنِ :عَدَمُ صَدَاقِ الْحُرَّةِ وَخَوْفُ الْعَنَتِ. وَلَا يَصِحُّ عَقْدُ النِّكَاحِ إِلَّا بِوَلِيٍّ وَشَاهِدَىْ عَدْلٌ.",
                "Pokok pikiran dalam paragraf diatas adalah ?",
                "Bab Menerangkan tidak sahnya pernikahan", "Bab menerangkan wanita yang boleh dinikahi", "Bab menerangkan syarat-syarat pernikahan","Bab menerangkan tentang pernikahan",
                4);
        addQuestion(q6);
        Question q7 = new Question("النِّكَاحُ مُسْتَحَبٌّ لِمَنْ يَحْتَاجُ إِلَيْهِ. وَيَجُوْزُ لِلْحُرِّ أَنْ يَجْمَعَ بَيْنَ أَرْبَعِ حَرَائِرَ، وَلِلْعَبْدِ بَيْنَ ثْنَتَيْنِ. وَلَا يَنْكِحُ الْحُرُّ أَمَةً إلَّا بِشَرْطَيْنِ :عَدَمُ صَدَاقِ الْحُرَّةِ وَخَوْفُ الْعَنَتِ. وَلَا يَصِحُّ عَقْدُ النِّكَاحِ إِلَّا بِوَلِيٍّ وَشَاهِدَىْ عَدْلٌ.",
                "Fakta yang terdapat dalam paragraf diatas adalah ?",
                "Menikah sunah bagi orang yang tidak membutuhkan", "Orang yang merdeka boleh menikahi 4 orang budak (hamba sahaya)", "Orang yang merdeka boleh menikahi 4 orang wanita merdeka (bukan budak)","Pernikahan hanya perlu dengan satu wali dan satu saksi",
                3);
        addQuestion(q7);
        Question q8 = new Question("النِّكَاحُ مُسْتَحَبٌّ لِمَنْ يَحْتَاجُ إِلَيْهِ. وَيَجُوْزُ لِلْحُرِّ أَنْ يَجْمَعَ بَيْنَ أَرْبَعِ حَرَائِرَ، وَلِلْعَبْدِ بَيْنَ ثْنَتَيْنِ. وَلَا يَنْكِحُ الْحُرُّ أَمَةً إلَّا بِشَرْطَيْنِ :عَدَمُ صَدَاقِ الْحُرَّةِ وَخَوْفُ الْعَنَتِ. وَلَا يَصِحُّ عَقْدُ النِّكَاحِ إِلَّا بِوَلِيٍّ وَشَاهِدَىْ عَدْلٌ.",
                "Ada berapakah syarat diperbolehkannya menikahi budak ?",
                "1", "2", "3","4",
                1);
        addQuestion(q8);
        Question q9 = new Question("النِّكَاحُ مُسْتَحَبٌّ لِمَنْ يَحْتَاجُ إِلَيْهِ. وَيَجُوْزُ لِلْحُرِّ أَنْ يَجْمَعَ بَيْنَ أَرْبَعِ حَرَائِرَ، وَلِلْعَبْدِ بَيْنَ ثْنَتَيْنِ. وَلَا يَنْكِحُ الْحُرُّ أَمَةً إلَّا بِشَرْطَيْنِ :عَدَمُ صَدَاقِ الْحُرَّةِ وَخَوْفُ الْعَنَتِ. وَلَا يَصِحُّ عَقْدُ النِّكَاحِ إِلَّا بِوَلِيٍّ وَشَاهِدَىْ عَدْلٌ.",
                "Lafadz atau kalimah manakah yang memiliki kedudukan sebagai maf’ul bih dalam paragraf diatas ?",
                "مُسْتَحَبٌّ", "أَمَةً", "يَجُوْزُ","الْحُرُّ",
                1);
        addQuestion(q9);
        Question q10 = new Question("النِّكَاحُ مُسْتَحَبٌّ لِمَنْ يَحْتَاجُ إِلَيْهِ. وَيَجُوْزُ لِلْحُرِّ أَنْ يَجْمَعَ بَيْنَ أَرْبَعِ حَرَائِرَ، وَلِلْعَبْدِ بَيْنَ ثْنَتَيْنِ. وَلَا يَنْكِحُ الْحُرُّ أَمَةً إلَّا بِشَرْطَيْنِ :عَدَمُ صَدَاقِ الْحُرَّةِ وَخَوْفُ الْعَنَتِ. وَلَا يَصِحُّ عَقْدُ النِّكَاحِ إِلَّا بِوَلِيٍّ وَشَاهِدَىْ عَدْلٌ.",
                "Kalimah yang memiliki kedudukan sebagai Maf’ul bih  maka dalam membaca kitab apakah tanda dan makna yang harus diberikan ?",
                "(م)Utawi ", "(خ)Iku", "(ص)Kang","(مف)Ing",
                4);
        addQuestion(q10);

    }
    private void addQuestion(Question question) {
        ContentValues cv = new ContentValues();
        cv.put(QuestionsTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(QuestionsTable.COLUMN_OPTION1, question.getOption1());
        cv.put(QuestionsTable.COLUMN_OPTION2, question.getOption2());
        cv.put(QuestionsTable.COLUMN_OPTION3, question.getOption3());
        cv.put(QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr());
        db.insert(QuestionsTable.TABLE_NAME, null, cv);
    }
}
}
