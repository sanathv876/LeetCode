public class PrefixCount {
    public int prefixCount(String[] words, String pref) {
        int prefixCount = 0;
        for(String word : words){
            if(word.contains(pref)){
                if(word.indexOf(pref) < (word.length()/2)-1){
                    prefixCount++;
                }else if(word.length() == 3){
                    prefixCount ++;
                }

            }
        }
        return prefixCount;

    }

    public static void main(String[] args) {
        PrefixCount p = new PrefixCount();
        String [] words = {"oub","rrjxxacsstfpccffprybnxvpmkssexgfhaxknuyzdfrpzsoyohkmggaukhpnyzmqjbzkqkctlrbnzrfxmfinf",
                "rrrndppiqofqacmkozxdlssekuaajpmtydjlw", "ddtvuojkktdfhcfmktkpkuhryoeyrhkewqgskkirixccqjymkxvfbkwafrrobtmslfsegzbzt",
                "oirlqqlfydoucxytmksafgbuyjqs","rrxpajoyi","ddwntyyrmmrmkdokfqlowklzcnemrybxukwzbmeuchfoaiibrujgazlfdj",
                "rarpptobyjqgjdrwxphggtilqhypnlvpwhixda","rrpfqbeyba","brxjhidpqsthlaatrpydqfprozesyxqkdfjrmqe",
                "xzvlcbgmxephipjtgtfzxdhqacpztojejhofexubwtxjwjcjsfqgklpgzuyzmxqfjkgzwdvk",
                "gjzcarsxfpdaeicyhwumogbogwnkrkerocpuasrjnlvhuavnshkajyotqypxjoyghljjfrlcnifikymjhueexzciykfltvmh","h",
                "pxkhkbxfspqbxfrrkbjiygbkdhxasunvtxytfpktgoeqtwvwfbqnpidabmbpsdceflgihohvjfclbxda",
                "xqumplvhsayxpzghfmktmzmbdowelhkxlydjgxrtctsxglggklpchmfxkjxwlwwzkpqbyt",
                "uofvaqzhaecwtyponqkvpolpncorpwwl","rriomxjoasrhtseqhcobzvmohxoucmfaozzmdzqiscjackvtcekdfsoucfkzicmibjwpvfunc",
                "jfqqwiozdpjinfpzpmhhjhqvb","kmdwejqmxmckucwscrcnjxmctjvxvgksjssgwghbmqurzxarlds",
                "cjwweeqmwjtbysduttahhrsgwdbwbcfnqkxaaczqigkwqhklzefevrasifkrq",
                "fnbsqafjrbobjppevxjdfzwblqichhiynjlwsacllclmsncehflbzruwptiksrrhoxiggwx",
                "igkezqdshykrkqdllltuzojjdmedrjwwdgxarjlitjzjrcnplgymudgjmuxdxdgnewwuizvleuuspuvyrufmb",
                "auqpjfvdultntwgrpjiaigdxrigciglwkefbkodbnbffwitneskwpdiodajleo","fllczlseyhztxonifnbfzdihrxqflxhlyice",
                "rrciegtghegenmdsrhbgrnuzamwumpzmvmdtnbrythdrwsrgmegnlpxwlqkzjdwerw","tqlwcmxvuyvrzsfrdfzuyuqqfotekcbxlhqrpcqrdwmitctrusbj",
                "boqgvvdhcgicybijuoynekfnqhirlepioumzauckvgkjvomtmaio","bporansjqnoakgioyfigcpsmsuudiftcmhziwahssdddioi",
                "cdhsvaykxlbmvlnmqtuczxaslvyprjqzyvxxsjbpl","sq","hryymsczwmifyjcmjuffmtadujjphrtwcpvewttifcozdmwalajzjpl",
                "wjzwzzjudvpxdrinflsctgqwbmqevylnutqocaxxuixnbyxdyynrxeieqkkrehbu",
                "qjargkftlfffclyufpuccftlwdufwvlkrtzfbskkcoarhjjwwynuxfmrrwylztheonzqugzord","dgsmitxcillfumdrtozlbbwkbtxskvmlnudxqijxqwofbdqfg",
                "enzojjdyeuszzhpbdta","cygawbbmrgmmtrlhe","evpcnb","vdziajiwijftmxlkssakzs","horvhouechdwjsgbctwbhfgeczyiunzuwrzlmdnwxzlyycxighohqgfrtazisvlm",
                "rrqyldfbhzjqauhlxvbkehirgnpjurvabucqsjtphsyawlkkdfh","bmtxdwmwt","rvcrsrjdukwbcyosnhvnam",
                "rrsrtyhjaakuudvmyofnwgcuaxhmifixkzemopvbikqjzyipgurmjssewjyevomp","oylvoiwzyfhehtyxnetjxmrzksxpzxbwmpukblcjqqwyhxhmndgbxaarnscvvmfy",
                "rrqafzp","ltldjxucbidjlaaweudlkwtvtspxpvakjqmgwaspugxbssecuqtyebvabfapvsnfaulfrgussqirclgjxzbyg",
                "lauhhwzwqausfvm","wmyjhecfdazrpotqfjxlfdimeqddbkrlhkkwhrkjqmjytgrxwsibztteuoqbbqldkk","rrnvvntovbahvtitsrfllbuqjhmblgseqxn","f",
                "zccdzdnwsejylkndwpwnyaevzbxlyacxvhrddhcraegkwvauzhnpadgnrmjsotmagrrwfn","cvsazvqcazlxumnqfpstupfacuyzusobvbaldiluwnwfbbagprrq",
                "rrytquf","lcjibeouquxudfzttfkysbttqjrguljwjqliok","nxvvhisqgnxjnwivktmvvfdgdvokrszlpowpruhcsoklmtljbhrpobpqgmalujew",
                "rrrfmdxuaktqudjdiagdcilwtpkihyvqrcrheuhrfvflydwyloo","rrnj","fohqorjevrumfsdmqmamksifuozzdeagjsapxilcwxhfqxomxaqswsvpyavvacyezpvckcyqajarongtolmlsjuapcra",
                "rlutjuobxxpbqqei","puuljbgtmoybrkgo","ud","fq","lrhauhhgaqrguotyrglghymtkchtsq","nrdxkhitfdwdnscalhjienjtkhhgnpievadfowlufmq","eiacimxegnw",
                "oqsezvgluojxplsnqupfwp","oltulwbiqhzdqpwiznalmtsjejuacnbcwfuzllpvmrywyfailpurdhhltryqanosoeizmlzqifvuzn","ntzrttbsxqvqcyskslbmaipgu",
                "rrhsmeudtsqfthzewvqwdzzwinnyzawzqzhqrgzuluylzqfzgbmtsntrdntdq","uijefbhzqpjoxtalvajzlvhvqyjbntmsfqwrxdofjtdeueilertmndewkjtrckoavbxbmerqomeshmhlstbfxxyfhdfmuim",
                "trdgwdtredlqknfhjsptjnducbnqvexpsggsoyzmtnbvskdg","rrkjtimutbipmywedsjypreojmapfishusnqatvdxotcp","remkvhxnjlwfpbffhkprscpcjzysclsgkdyjczftgpsnouqupwytjpwrrqdyztkwxzxaicwqkrmziyrzpstctbmchqxr",
                "obeprwdggrcaxdnjxduyub","gb","pymvzbtrsdemkgieexpspjawqurgryovkwzlkmxieqeyayzoqtnuymequmuhezs","mljwawotlombcnnrhqzmhopzdihwoffligzhgzjvnyyhiknjxenhmybqqxztrqkbsuhduxovehtromrdwo",
                "sprvuironbfhxxupprpxnhkosefvmqjnitmeemsucayxiiuibgrhbskivncdmoaeroavgevccabq","rrjdsnkrmhekdl","vwizphfkvexzyccuwbifgyymopzivb","vxzperdrldh",
                "vstfeimpakrujoqliwrszwmrzfyodmnekaakvuitppifzsrgelacgfontzozzsshkngdlipjksxmgumyblbbhkqj","oekuyywvojkvpxijgpzrhstfaat","qkzqubsmitlpydfnzbnapvkblacdtehvpfkeitkamhhcgxtjcrm",
                "uargexkdiaauyteiokuhmoaowkexeakutfikicgsieojnhbboxbahkpyyguraiklvtd","ybvkxohogztqivvxppwswewixwuosxmgcfjrxfyias","ifraoutthwyrbhyecxmivxnzku",
                "rrkekeoeyovksnpwnprvdqbmcexdqdubquedbwvqqdlmhyybhq","apejiixlvdgagh","anzktmvearllyviotkvfvbyqgcuptbnf","cumehawcuixhavitrjsjdeon","jtmbuoozakfwcbeyvddfegiskacrsencnmlowjnrhbvklydbgplv",
                "rrnkiqmotaohieyomxhwopllqltuepjymudruhzsirhndvxrzwwcntbudqahougikllviiumatvnopqjrufnwdklq","phwezoocakorvkevbhcicsfwnliprbshdudbyanjiqiy",
                "ezrjymxzpddeoczeiehparadajbxaihqujcberquhyjvzbzhxodynpxlkenoyxejndyuacybxrfkgsgkxjinywrpkk",
                "dvqetqpvjiizcsidkwpjcfqgttmzewzhiplqxqvxnxdnyjuxbabniagrcrcwzuenzxnbhnkhtzjoxbolkupahehqvddnzgubeo",
                "gmlzvqdcyewirndbtitgczptapgpvvtqskfboexkxhnnxjpbjxzbiowkqtztlvuqqdrhittfdcghyxjg","vdyymztrbdfqgomvcztzpsuxwuuiujahfmatlookusicsgnlguhctdeh"};
        System.out.println(p.prefixCount(words, "fa"));
    }

}
