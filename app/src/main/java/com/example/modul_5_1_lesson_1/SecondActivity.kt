package com.example.modul_5_1_lesson_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.item.view.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_second)

        val inten_sec = intent
        val imageData = inten_sec.getSerializableExtra("image") as ImageData
        imagE.setOnClickListener {
            Toast.makeText(this, "Dasturchi:Artikov Doniyor Xo'jamurodovich", Toast.LENGTH_SHORT).show()
        }

        if(imageData.text == "Android") {
            text_Sec.text = "Android dasturlash - Mobil Taraqqiyot\n" +
                    "\n" +
                    "Dasturlashni endigina boshlovchilar yoki shu sohaga qiziquvchilar qaysi yo'nalishni tanlash kerak va uning yaqin kelajagi qanday degan savol qiziqtiradi. Albatta, tanlangan yo'nalish jamiyatga foydasi tegadigan, kelajagi bor va eng muhimi yuqori daromadga olib keladigan bo'lishi kerak.\n" +
                    "\n" +
                    "Hozirgi kunda dunyo aholisining deyarli barchasi mobil qurilmalarga ega ekanligi hammaga ma'lum. Bu qurilmalarning juda katta qismi Android operatsion tizimida ishlaydi. Statistik ma'lumotlarga qaraganda, aqlli qurilmalar(smart devices)ning 80% dan ortiq qismi Android tizimida ishlaydi. Android tizimi keng imkoniyatli, dasturchilarga qulay, bepul va albatta ochiq kodlidir." +
                    "Android qurilmalar\n" +
                    "\n" +
                    "Android operatsion tizimi — Linux yadrosida yaratilgan portativ (tizimli) operatsion tizim bo'lib, kommunikatorlar, planshetli kompyuterlar, elektron kitoblar, raqamli pleyerlar, qo'l soatlari, netbuklar, smartbuklar va smartfonlarda ishlaydi. Google tomonidan sotib olingan Android Inc. kompaniyasi tomonidan yaratilgan. Keyinchalik Google tizim rivojlanishi bilan shugʻullanadigan Open Handset Alliance (OHA) ittifoqini tuzdi. Android yordamida Java dasturlarni tuzish mumkin.\n" +
                    "\n" +
                    "2012-yilning 3-choragida sotilgan smartfonlarning 75 %ida Android operatsion tizimi oʻrnatilgan edi. Bugungi kunga kelib 50 milliarddan ortiq android ilovalari ro'yhatga olingan. Bu android tizimida ishlaydigan qurilmalarning ko'pligi va ular uchun ilovalarga talablarning yuqoriligini ko'rsatadi. AQSHning barcha shaharlaridagi android dasturchilari uchun yillik maosh o'rtacha 68 000\$ - 82 000\$ oralig'ida qilib bergilangan. O'zbekiston sharoitida Siz boshqalar uchun dasturlarni yozib berish bilan tajribangizga qarab oylik \$500 - \$2 000 va unda ham ko'proq topa olasiz.\n" +
                    "\n" +
                    "O'zbekiston sharoitida statistikalarga qaraganda dasturchilarning soni aholining 0.3% dan ham kamroq ekani ko'rsatmoqda, ya'ni 3000 atrofida degani. O'zbekiston sharoitidagi android ilovalarga bo'lgan ehtiyojlarni qondirish uchun ancha kam ko'rsatkich. Android tizimida dastur tuzishning qulayligi va imkoniyatlarni cheklanmaganligi bu tizimni ommalshishiga turtki bo'lmoqda.\n" +
                    "\n" +
                    "Kimlar o'rgana oladi\n" +
                    "Dasturlashni o'rganish uchun Siz aynan axborot texnologiyalar sohasida ishlashingiz shart emas. Buni istagan inson o'rganishi mumkin, Siz yurist, iqtisodchi, o'qituvchi yoki istalgan boshqa kasb egasi bo'lishingizdan qat'iy nazar o'rgana olishingiz mumkin. Bu Siz o'ylaganingizdek unchalik qiyin emas ham, unchalik murakkab jarayon ham emas. Faqat huddi hayotdagidek to'g'ri fikrlash, to'g'ri yondashishni bilsangiz bo'lgani. Umuman olganda Sizda mantiq bo'lsa va shu sohaga qiziqishingiz yuqori bo'lsa bas.\n" +
                    "\n" +
                    "Dasturlashni o'rganing, chunki u fikrlashni o'rgatadi\n" +
                    "\n" +
                    "Professional o'quv markazi. Boshlang'ichdan to mutaxassisgacha\n" +
                    "O'zbekistondagi Android dasturlash va uning taraqqiyotini inobatga olib, Sizlarga \"Personal Development Process\" o'quv kurslarini tavsiya etamiz. Bu yerda Siz belgilangan vaqt oralig'ida tizimli ravishda to'liq hajmda Android dasturlash kurslarida dasturchi bo'lib chiqishingiz mumkin bo'ladi. O'quv mazkazi kurslarida qatnashib, Siz dasturlash sohasidagi boshlang'ich bilimlar olishdan boshlab, tayyor mutaxassis bo'lib yetishishingiz mumkin.\n" +
                    "\n" +
                    "Mazkur kursning asosiy maqsadi quyidagilardan iborat:\n" +
                    "\n" +
                    "Yuqori darajali dasturchilarni kashf etish;\n" +
                    "Davlat organlari va xususiy tashkilotlarga dasturchilarni tayyorlash va yaxshi o'zlashtirgan dasturchilarni tavsiya etish;\n" +
                    "Kurslarni yaxshi o'zlashtirgan dasturchilarni o'zimizning jamoa(team) ga taklif etish." +
                    "Dars jarayonidan lavha\n" +
                    "\n" +
                    "Hozirgi kunda o'rganish kerak bo'lgan ilmlar juda ko'p. Bularni qisqa vaqt ichida sifatli o'rganish uchun esa Sizga yaxshi murabbiy kerak bo'ladi. Yangi formatda, yangicha ko'rinishda bilimlaringizni oshiring. Darslar ofisda developerlar uchun ajoyib bo'lgan muhitda o'tkaziladi.\n" +
                    "\n" +
                    "Kurslarning davomiyligi qanday?\n" +
                    "Android dasturlashni to'liq kursi 5 oyga mo'ljallangan bo'lib, haftasiga uch marta - haftaning toq yoki juft kunlari, ikki soatdan bo'lib o'tadi. Kurslar mazmunidan kelib chiqqan holda modul tizimiga asoslangan bo'lib, uchta moduldan iborat:\n" +
                    "\n" +
                    "Module 1. Java core basics\n" +
                    "\n" +
                    "Birinchi modulda dunyodagi dasturchilar eng ko'p foydalanadigan Java tili asoslarini o'rgatiladi. Bu modulda quyidagi tushunchalar bilan tanishiladi: Data Types, Variables, Arrays, Operators, Classes, Inheritance, Interfaces;\n" +
                    "\n" +
                    "Module 2. Module. Beginner Android Development\n" +
                    "\n" +
                    "Ikkinchi modulda Android studio bilan ishlash mahoratiga ega bo'lasiz. Bunda sizga quyidagi bilimlar beriladi: Standard components, activities, listview, dialogs, animations, notifications, menus;\n" +
                    "\n" +
                    "Module 3. Advanced Android Development\n" +
                    "\n" +
                    "Uchinchi modulda android ilovalarni jahon standarti bo'yicha tayyorlash ko'nikmalariga ega bo'lasiz va yuqori darajali mutaxassisga aylanasiz. Ushbu modulda quyidagi bilimlar va tushunchalarga ega bo'lasiz: Adaptive, database, rest api, service, fragment, thread, widget, multitouch, location, orientation, broadcast;"
        }else{
            if (imageData.text == "Java"){
                text_Sec.text = "1. Java nima?\n" +
                        "Java dasturlash tili va platforma.\n" +
                        "Java yuqori darajali, mustahkam, xavfsiz va obyektga yo`naltirilgan til. Platforma: dastur bajarila oladigan ixtiyoriy apparat yoki dasturiy muhit platformadir. Javaning ham o`zini mahsus bajarilish muhiti – platformasi mavjud (JRE – Java Runtime Environment).\n" +
                        "\n" +
                        "2. Javadan qayerda foydalaniladi?\n" +
                        "“Sun” firmasi ma`lumotiga ko`ra, 3 mlrd atrofidagi qurilmalar Javani ishlatadi (eski ma`lumot, hozir undan ko`p).\n" +
                        "Mana ulardan ba`zilari:\n" +
                        "-Shaxsiy kompyuter dasturlari (Desktop Applications) – acrobat reader, media-pleyer, antiviruslar va h.k.\n" +
                        "-Web-dasturlar\n" +
                        "-Korxona-tashkilotlar dasturlari (Enterprise Applications) – bank yoki ishlab chiqarishga oid dasturlar\n" +
                        "-Mobil dasturlar\n" +
                        "-Smart kartalar\n" +
                        "-Robotlar\n" +
                        "-O`yinlar\n" +
                        "-…..\n" +
                        "\n" +
                        "3. Java (JavaScript tili bilan adashtirmang, bir-biriga o’xshash emas) dasturlari odatda bayt kodlarga (bytecode) kompilyatsiya qilinadi(class fayli tarzida) va bu har qanday Java platformasida ishlashini ta’minlaydi. Java platformasi apparat yoki dasturiy muhit bo`lishi mumkin. O`zbekstonda Javada bevosita ishlaydigan apparatlar kam uchraydi. Bizda JVM, ya`ni Java Virtual Machine keng tarqalgan.\n" +
                        "\n" +
                        "4. Asosiy konsepsiyalari:\n" +
                        "Java quyidagi 5 maqsad uchun qurilgan, u shunday til bo’lishi kerakki:\n" +
                        "\n" +
                        "Oddiy, obyektga mo’ljallangan, taqsimlangan va o’rganishga oson bo’lsin.\n" +
                        "Mustahkam va xavsiz bo’lsin\n" +
                        "Qaysidir qurilma platformasidan yoki uning arxitekturasidan mustaqil bo’lsin(ya’ni qaysidir platformaga tobe bo’lmasin).\n" +
                        "Juda samarali bo’lsin.\n" +
                        "Dasturlash tili uchun tarjimon(interpreter) yozish mumkin bo’lsin.\n" +
                        "Shuningdek dasturlash tili parallel ishlashni va dinamik tiplashda foydalanishni ta’minlay olsin.\n" +
                        "\n" +
                        "5. Dunyo bo’yicha dasturlash sohasidagi eng yetakchi hisoblangan stackoverflow.com saytini 2013-2015 yillardagi tekshiruvlariga(http://stackoverflow.com/research/developer-survey- 2015#tech-lang) ko’ra server-tomon(server side) dasturlash tillari ichida Java 1-o’rinni bermay kelmoqda. Undan tashqari o’sha saytning eng ko’p beriladigan savollar uchun foydalinadigan teglarida ham Java yetakchi o`rinlarda turibdi.\n" +
                        "\n" +
                        "6. Javada qanaqa dasturlar yoziladi: asosan 4 tipdagi\n" +
                        "1) Standalone applications – Linux, Mac yoki Windowsga o`rnatib, kundalik ishladatigan dasturlarimiz: mp3 pleyer, ofis, antivirus kabilar. Ular AWT, Swing yoki JavaFX texnologiyalari orqali tuziladi\n" +
                        "2) Web Applications – tarmoq orqali ishlovchi ixtiyoriy dasturlar. Eslatma: web dasturlar ikki qismdan, server tomon hamda klient tomon (brauzer) dan iborat. Javada faqat server tomoni uchun yoziladi. Bunda servlet, jsp, jsf kabi fundamental texnologiyalardan boshlab Spring, Play kabi freymworklar qo`l keladi. Umuman olganda brauzer uchun HTML, CSS hamda Java Scriptdan boshqa tilda yozib bo`lmaydi.\n" +
                        "3) Enterprise Applications – bu dasturlar yirik salmoqqa ega bo`lib, odatda katta jabhalarda ishlatiladi. Banklar, tashkilotlar yoki astronomiya ishlarida. Ular yuqori havfsizlik, yuklamani (nagruzka) serverlarga teng taqsimlash (load balancing) yoki klasterlash (clustering – katta tizimdan xuddi yagona obyekt sifatida foydalanish) kabi sifatlarni talab qiladi. Javada bular bor.\n" +
                        "4) Mobile Applications – Mobil qurilmalarga mos dasturlarni ham Javada yozish mumkin. Androiddan boshlab, Java ME (JME – Java Micro Edition) gacha. JME ga misol qilib, Nokia telefonlarimiz uchun ishlangan JAR o`yinlarni misol keltirish mumkin.\n" +
                        "\n" +
                        "7. Javaning sintaksisi C++ ga asoslangan. Shuning uchun C++ tilini biladiganlar Javani oson o`rganishadi. Lekin undagi ko`pchilik xususiyatlar olib tashlangan. Masalan: Pointer(ko`rsatkich)lar bilan to`g`ri ishlash, ya`ni Javada alohida ko`rsatkich tushunchasi yo`q. Operatorlarni qayta yuklash ham olib tashlangan. Yana eng muhimi, ishlatilmaydigan xotira (unreferenced objects) avtomatik tozalanadi. Buni Javadagi Garbage Collector (GC – chiqindi yig`ishtirgich) amalga oshiradi. C++ da bu destruktorlar orqali qo`lda (manual – ruchnoy) qilingan. Bundan tashqari Java har bir yangi versiyada bundan qulay imkoniyatlarni qo`shib kelmoqda. Ayni paytda oxirgi versiya 8-sidir. 2014-yil 18-martda ommaga e’lon qilindi.\n" +
                        "\n" +
                        "8. JRE va JDK ni nima farqi bor? JRE – Java Runtime Environment JDK – Java Development Kit JRE bu faqat dastur bajarilishi uchun kerak bo`lgan muhit, xolos. Dasturchi bo`lmagan oddiy foydalanuvchilarga Java dasturlari bajarilishi uchun JRE yetarli. JDK = JRE + dasturlashga oid qo`shimcha instrumentlar. Bu esa dasturchilarga kerak. Formuladan ko`rinib turibdiki, JDK ning hajmi JREdan katta bo`ladi. U bir marta ko`chirib o`rnatiladi xolos.\n" +
                        "\n" +
                        "9. Dunyoda qancha Java dasturchilar bor?\n" +
                        "Oracle kompaniyasi tahminan 9 mln desa, Wikipedia 10 mln atrofida demoqda. NumberOf.net komandasi esa 9.007.346 sonini keltirishgan. Albatta bu statistika qaysidir vaqt uchun. Ayni paytda yana o`sib bormoqda. Javada kod yozishga mo`ljallangan Eclipse (bepul) muhiti bir yilni ichida 7 mln marta ko`chirilgan. Eng mashxur web-konteynerlardan biri bo`lgan Tomcat esa oyiga o`rtacha 550 ming, yiliga esa 6.6 mln marta ko`chirilar ekan. Dunyoda qancha odam ishsiz? Ishlilarning qanchasi dasturchi? Dasturchilarning shunchasi Javachi!\n" +
                        "\n" +
                        "10. Nima uchun aynan Javani o`rganamiz?\n" +
                        "Hozirgi kunda dasturlash tillari to`g`risidagi ayrim tortishuvlar quloqqa chalinadi. Bu til yaxshi… Yo`q, mana bunisi… Bu tilda qilingan ishni, bunisida qilib bo`lmas emish, mana bunisi eng tezi emish va hokazo. Bular xato fikrlar. Biz dasturlash tillarini imkoniyati haqida tortishayotkan bir paytda, g`arbliklar boshqa galaktikalarni o`rganib, odamni boshini boshqa tanaga ko`chirishni amallashmoqchi! Keling, bu tortishuvga bitta o`zbekona o`xshatish bilan nuqta qo`yamiz. “Lacetti yaxshi… Yo`q Nexia yo`lga zo`r… Malibu qulay va obro`li… Captiva undanam obro`li… Sparkka yetmaydi baribir va hokazo”. Sezganingizdek, bu xato tortishuv. Hammasini o`z o`rni va maqsadi bor. Dasturlash tillari ham shu kabidir. Javaning ham o`z maqsadi bor. Kerak bo`lsa, bir nechta tillardan foydalanib yagona kompleks dastur yozish mumkin."

            }else{
                if (imageData.text == "Python"){
                    text_Sec.text = "Python (talaffuzi: Piton) — umumiy-maqsadli dasturlash uchun keng tarzda foydalaniladigan yuqori darajali dasturlash tili. Ushbu dasturlash tili Guido van Rossum tomonidan yaratilgan va birinchi marta 1991-yilda foydalanib koʻrilgan.\n" +
                            "\n" +
                            "Python har xil platformalar uchun yozilgan, masalan Windows, Linux, Mac OS X, Palm OS, Mac OS va boshqalar. Python Microsoft.NET platformasi uchun yozilgan realizatsiyasi ham mavjud boʻlib, uning nomi — IronPython.\n" +
                            "\n" +
                            "\n" +
                            "Guido van Rossum\n" +
                            "\n" +
                            "Mundarija\n" +
                            "1\tSintaksis\n" +
                            "1.1\tSalom, dunyo!\n" +
                            "2\tIshlatilishi\n" +
                            "2.1\tWeb dasturlash\n" +
                            "2.2\tGrafika\n" +
                            "2.3\tPythonni ishlatadigan dasturlar\n" +
                            "2.4\tPythonni ishlatadigan kompaniyalar\n" +
                            "3\tManbalar\n" +
                            "4\tHavolalar\n" +
                            "Sintaksis\n" +
                            "Unda Lua tiliga oʻxshab, bir vaqtning o'zida bir nechta o'zgaruvchiga qiymat berish mumkin. Shuningdek, yangi o'zgaruvchi kiritmasdan turib, ikkita o'zgaruvchining qiymatlarini almashtirish mumkin:\n" +
                            "\n" +
                            " x, y = y, x\n" +
                            "Va uni funksiyalaridan ham shunday turda qaytarishingiz mumkin:\n" +
                            "\n" +
                            "def function():\n" +
                            "    x = \"Jimbo\"\n" +
                            "    y = \"Wales\"\n" +
                            "    return x, y\n" +
                            "Salom, dunyo!\n" +
                            "# -*- coding: utf-8 -*-\n" +
                            "print(\"Salom, dunyo!\")\n" +
                            "Ishlatilishi\n" +
                            "Web dasturlash\n" +
                            "Zope — CMS yaratish uchun server va veb dasturlar qilish uchun dastur.\n" +
                            "Django — web yaratish qilish uchun dastur.\n" +
                            "Turbogears — web yaratish qilish uchun dastur.\n" +
                            "CherryPy — web yaratish qilish uchun dastur.\n" +
                            "Plone — saytni muhofaza qilish uchun dastur.\n" +
                            "Mailman — „Rassilka“ yaratish uchun dastur\n" +
                            "MoinMoin — viki — dvijok internet va intranet uchun\n" +
                            "PlanetPlanet — RSS oqimini sindikatsiyalash\n" +
                            "Grafika\n" +
                            "Skencil — Vektor grafikasi uchun dastur\n" +
                            "Pythonni ishlatadigan dasturlar\n" +
                            "Wikipedia — botlarni yozish uchun ishlatadi.\n" +
                            "Civilization IV — Yaxshi strategiya oʻyin.\n" +
                            "Pythonni ishlatadigan kompaniyalar\n" +
                            "Kosmik teleskop instituti\n" +
                            "NASA\n" +
                            "Google\n" +
                            "DreamWorks\n" +
                            "Industrial Light & Magic\n" +
                            "Firaxis Games\n" +
                            "Apple Computer"
                }else{
                    if (imageData.text == "MySQL"){
                        text_Sec.text = "MySQL — bu eng mashhur va juda ko'p foydalaniladigan ma'lumotlar bazasini boshqarish tizimi(MBBT) hisoblanadi. Bu tizim juda katta ma'lumotlar bilan ishlash uchun yaratilmagan, aksincha biroz kichik hajmdagi bazalar bilan katta tezlikda ishlash uchun yaratilgan. Uning asosiy ishlash doirasi, saytlar hisoblanadi. Hozirgi kunda juda ko'p sayt va bloklarning ma'lumotlari aynan shu MBBT saqlanadi.\n" +
                                "\n" +
                                "Ho'sh, saytlarning nimalari bazada saqlanishi mumkin? Dastlab, ma'lumotlar saqlash uchun dasturchilar fayllardan foydalanishgan, ya'ni fayl ochilib kerakli ma'lumotlar u yerga saqlanib, kerakli paytda chaqirib ishlatilgan. Keyinchalik fayllardan voz kechilib(noqulayliklar yuzaga kelgan, ya'ni faylni ochish, o'qish, yopish,.. ko'p vaqtni olib qo'ygan, u yerdan qidirish, xullas juda ko'p), ma'lumotlar bazasiga o'tilgan. Bazada saytdagi maqolalar, sayt foydalanuvchilari haqidagi ma'lumotlar, sayt kontentlari, qoldirilgan kommentariyalar, savol-javoblar, hisoblagich natijalari va shunga o'xshash juda ko'p ma'lumotlar saqlanadi. MySQL shunday ma'lumotlarni o'zida saqlaydi.\n" +
                                "\n" +
                                "MySQL — juda katta tezlikda ishlovchi va qulay hisoblanadi. Bu tizimda ishlash juda sodda va uni o'rganish qiyinchilik tug'dirmaydi.\n" +
                                "\n" +
                                "MySQL tizimi tcx kompaniyasi tomonidan, ma'lumotlarni tez qayta ishlash uchun korxona miqyosida ishlatishga yaratilgan. Keyinchalik ommalashib, saytlarning asosiy bazasi sifatida yoyildi.\n" +
                                "\n" +
                                "So'rovlar SQL tili orqali amalga oshiriladi. Bu MBBT relyatsion ma'lumotlar baza hisoblanadi. Bu degani baza jadvallar, jadvallar esa ustunlardan tashkil topgandir.\n" +
                                "\n" +
                                "MySQL MBBTi 2 xil turdagi litsenziyaga ega. Birinchisi tekin, ya'ni MYSQLni ko'chirib olish va ishlatish hech qanday harajat talab qilmaydi va GPL(GNU Public Licenseb, GNU) litsenziyasiga asoslanadi. Ikkinchi turi, GPL shartiga ko'ra, agar siz MySQL kodlarini biror dasturingizda ishlatsangiz, bu dasturingiz ham GPL(tekin) bo'lishi kerak. Bu esa dasturchiga to'g'ri kelmaydi. Shuning uchun, bu dasturingizni pullik qilishingiz uchun MySQL pullik litsenziyasini sotib olishingiz kerak.\n" +
                                "\n" +
                                "MySQL logotipi delfin hisoblanadi. Bu delfinni ismi «Sakila»dir. Bu logotipni OpenSource tuzuvchilaridan biri Ambrose Twebaze ga tegishlidir.\n" +
                                "\n" +
                                "MySQL juda ko'p operatsion tizimlar bilan ishlay oladi. Bularni yozadigan bo'lsam: AIX, BSDi, FreeBSD, HP-UX, Linux, Mac OS X, NetBSD, OpenBSD, OS/2 Warp, SGI IRIX, Solaris, SunOS, UnixWare, Windows 95, Windows 98, Windows NT, Windows 2000, Windows XP, Windows Server 2000, Windows Vista, Windows 7,…\n" +
                                "\n" +
                                "MySQL shved korxonasi MySQl AB ga tegishli bo'lgan, keyinchalik SUN firmasi MySQL ni o'ziniki qilib olgan. Bir necha yil oldin esa, gigant korxonalardan biri Oracle, SUN firmasini sotib oldi va hozirda MySQL Oracle firmasi mahsuloti sifatida chiqib kelmoqda. Bu bir hisobda Microsoft SQL Server ga katta raqobatdosh ekanligini anglatadi.\n" +
                                "\n" +
                                "MySQL bir necha serverlarning bir qismi hisoblanadi. Misol uchun, WAMP, AppServ, LAMP, Denwer,… Kliyentlar MySQL serveriga ma'lum bir kutubxonalar orqali ulanadi. MySQL ga quyidagi dasturlash tillari ulanib ishlashi mumkin: Delphi, C, C++, Java, Perl, Php, Python, Ruby va boshqalar."
                    }else{
                        text_Sec.text = "1994 yili PHP tilinig yaratuvchisi Rasmus Lerdorf o‘zinig saytiga mehmonlar kirishini hisoblash uchun Perl dasturlash tilida maxsus qobiq yozib amalda qo‘llagan. Ko‘p o‘tmay qobiqni ishlash unumdorligi juda past va sekinligi aniqlanganidan so‘ng, dasturlarni yangidan “S” tilida yozib chiqishga to‘g‘ri keladi. Keyin, dastlabki dastur kodlari muallif tarafidan barchaga ko‘rish uchun serverga nashr qilingan. Server foydalanuvchilari kodlar bilan qiziqib, uni ishlatish muxlislari ham paydo bo‘lgan.\n" +
                                "Hademay, bu dasturlar alohida loyihaga aylanib, 1995 yilning iyun oyida dasturiy mahsulot   PHP (Personal Home Page) nomi bilan birinchi nashri chiqarildi.\n" +
                                "\n" +
                                "1996 yil aprel oyida dasturlar jiddiy qayta ishlanganidan so‘ng, PHP/FI (Personal Home Page / Forms Interpreter) nomi bilan mahsulotning ikkinchi nashri paydo bo‘ldi. Bu mahsulot HTML-kod ichiga yozilib, HTML-formalarni qayta ishlab, hozirgi PHP dasturlash tilining tayanch imkoniytlarini ichiga olgan. PHP/FI kod yozilishi Perl tiliga juda oxshagan, lekin soddaroq bo‘lgan.\n" +
                                "\n" +
                                "1997 yili PHP/FI 2.0 nashri chiqdi. O‘sha paytda bu mahsulot bilan dunyo bo‘yicha bir necha ming odam foydalanib, taxminan 50 ming domen bo‘lib, Internetning 1%-ni tashkil qildi.\n" +
                                "\n" +
                                "1997 yilda Endi Gutmans va Ziv Suraski PHP/FI kodini boshqatdan yozib chiqishdi, chunki eski kod ular ishlatayotgan elektron tijorat tizimlari uchun yaroqsiz edi. Eski kodning mualliflaridan yordam olish uchun ular birlashishni taklif etib, PHP3 nomli loyihani PHP/FI -ning rasmiy vorisi deb e’lon qilishdi. Yangi loyiha uyushgandan keyin PHP/FI loyihasi ishlab chiqarilishi to‘xtatilgan.\n" +
                                "\n" +
                                "PHP 3.0 -ning eng kuchli taraflaridan biri uning kengaytirala olinadigan yadrosi (tizimning boshqaruv qismi) bo‘lib, bundan tashqari, ma’lumot jamg‘armalar bilan, turli protokollar va interfeyslar bilan birgalikda ishlash keng imkoniyatlari yaratildi. Muvaffaqiyatga erishishga ancha ahamiyatli fakt bu yangi tilni boyligi va ob’yektlarga mo‘ljallangan dasturlashni qo‘llay olishi. Yangi loyiha bilan birga nafaqat tilni tashqi, ichki tuzulishi o‘zgardi, balki o‘zini nomi ham. Endi PHP qisqartmasi “PHP: Hypertext Preprocessor” ma’nosini anglatishi bildirildi.\n" +
                                "\n" +
                                "1998 yilning oxirida PHP foydalanuvchilarining soni o‘n minglardan oshdi. Yuz mingdan oshiq veb-saytlar bu tilni qo‘llashini e’lon qilishdi. Taxminan Internetning 10% serverlarida PHP 3.0 o‘rnatilgan edi.\n" +
                                "\n" +
                                "1998 yilning iyun oyda PHP3 to‘qqiz oy ommaviy tekshiruvidan keyin rasman e’lon qilindi. Shu yilning qishida Endi Gutmans va Ziv Suraski PHP yadrosini qaytadan ishlab chiqarishni boshlashgan. Ularning asosiy vazifasi PHP tizimining unumdorligini ko‘tarish va kodning modullarini yaxshilash edi.\n" +
                                "\n" +
                                "1999 yilning o‘rtalarida birinchi marta taqdim qilingan yangi yadro “Zend Engine” deb nomlangan. Uni asosida tuzilgan yangi til PHP4 2000 yilning may oyida rasman chiqarilgan. Unumdorlik yaxshilangandan tashqari, PHP 4.0 muhim yangiliklarga ega bo‘lib, sessiyalarni qo‘llash, buferli chiqarish, kiritilgan ma’lumotlarni havfsiz qayta ishlash va yana bir necha yangi til tuzuvchilarini paydo bo‘lishidan iborat.\n" +
                                "\n" +
                                "Hozirgi kunlarda “Zend Engine” qayta yaxshilanib PHP5 tili ishlab chiqarildi. Asosiy o‘zgarishlar ob’yektlarga mo‘ljallangan dasturlash modelida bo‘lib, tilning imkoniyatlarini yanada kengaytirdi."
                    }
                }
            }
        }
        imagE.setImageResource(imageData.img)

    }
}