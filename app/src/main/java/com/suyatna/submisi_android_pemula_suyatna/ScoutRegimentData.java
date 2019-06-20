package com.suyatna.submisi_android_pemula_suyatna;

import java.util.ArrayList;

public class ScoutRegimentData {
    public static String[][] data = new String[][] {
            {
                "Eren Jaeger",
                    "Titan Boy  (巨人の小僧)",
                    "Human, Intelligent Titan",
                    "Male",
                    "15",
                    "https://vignette.wikia.nocookie.net/shingekinokyojin/images/a/a1/Eren_Jaeger_%28Anime%29_character_image.png",
                    "Eren Jaeger (エレン・イェーガー Eren Yēgā?) is a member of the Scout Regiment and the main protagonist of Attack on Titan. He is the only son of Grisha and Carla Jaeger, the adoptive brother of Mikasa Ackermann, the younger paternal half brother of Zeke Jaeger[17] and the holder of the \"Mysterious Titan\" and the Founding Titan.",
                    "Shiganshina District"
            },
            {
                "Mikasa Ackermann",
                    "Mikasa Akkāman (ミカサ・アッカーマン)",
                    "Human",
                    "Female",
                    "15",
                    "https://vignette.wikia.nocookie.net/shingekinokyojin/images/4/4f/Mikasa_Ackermann_%28Anime%29_character_image.png",
                    "Mikasa Ackermann (ミカサ・アッカーマン Mikasa Akkāman?) is one of the two deuteragonists of the series. She is the adoptive daughter of Grisha and Carla Jaeger and the adoptive sister of Eren Jaeger.",
                    "Shiganshina District Outskirts"
            },
            {
                "Armin Arlelt",
                    "Colossal Titan (超大型巨人)",
                    "Human, Intelligent Titan",
                    "Male",
                    "15",
                    "https://vignette.wikia.nocookie.net/shingekinokyojin/images/9/93/Armin_Arlelt_%28Anime%29_character_image.png",
                    "Armin Arlelt (アルミン・アルレルト Arumin Arureruto?) is a soldier in the Scout Regiment. He is also a childhood friend of Eren Jaeger and Mikasa Ackermann, and is one of the two deuteragonists of the series. Although he appears to be the physically weakest of the 104th Cadet Corps, his high intelligence and strategic genius makes him an invaluable asset, though he does not consider himself to be one and is known to have low self-esteem. After the battle of Shiganshina District, he took the power of the Titans from Bertholdt Hoover and became the Colossal Titan.",
                    "Shiganshina District"
            },
            {
                "Sasha Braus",
                    "Potato Girl (芋女 Imon'na)",
                    "Human",
                    "Female",
                    "15",
                    "https://vignette.wikia.nocookie.net/shingekinokyojin/images/0/0a/Sasha_Braus_%28Anime%29_character_image.png",
                    "Sasha Braus (サシャ・ブラウス Sasha Burausu?) is a member of the Scout Regiment and one of the few former members of the 104th Cadet Corps, of which she was ranked 9th out of the top 10. A compulsive food hoarder with an overly polite way of speech, Sasha originates from Dauper, a village in the southern territory of Wall Rose.",
                    "Dauper"
            },
            {
                "Hange Zoë",
                    "Hanji Zoe (ハンジ・ゾエ)",
                    "Human",
                    "Female",
                    "27",
                    "https://vignette.wikia.nocookie.net/shingekinokyojin/images/e/e4/Hange_Zoë_%28Anime%29_character_image.png",
                    "Hange Zoë (ハンジ・ゾエ Hanji Zoe?) is the 14th Commander of the Scout Regiment and a former section commander (分隊長 Bun-taichō?) in charge of the Fourth Squad. Hange conducts research on Titans to the point of being obsessed with them and as such, is deeply interested in Eren Jaeger, who has the ability to transform into a Titan.",
                    "-unknown-"
            },
            {
                "Levi Ackermann",
                    "Rivai Akkāman (リヴァイ・アッカーマン)",
                    "Human",
                    "Male",
                    "25",
                    "https://vignette.wikia.nocookie.net/shingekinokyojin/images/b/b1/Levi_Ackermann_%28Anime%29_character_image.png",
                    "Levi Ackermann (リヴァイ・アッカーマン Rivai Akkāman?), often formally referred to as Captain Levi (リヴァイ兵長 Rivai Heichō?), is the squad captain (兵士長 Heishichō?, lit. \"leader of the soldiers\") of the Special Operations Squad within the Scout Regiment, and is said to be humanity's strongest soldier.",
                    "Underground"
            }
    };

    public static ArrayList<ScoutRegiment> getScoutRegimentListData() {
        ScoutRegiment scoutRegiment = null;
        ArrayList<ScoutRegiment> scoutRegimentArrayList = new ArrayList<>();

        for (String[] setData : data){
            scoutRegiment = new ScoutRegiment();
            scoutRegiment.setName(setData[0]);
            scoutRegiment.setAlias(setData[1]);
            scoutRegiment.setSpecies(setData[2]);
            scoutRegiment.setGender(setData[3]);
            scoutRegiment.setAge(setData[4]);
            scoutRegiment.setPhoto(setData[5]);
            scoutRegiment.setDescription(setData[6]);
            scoutRegiment.setBirthplace(setData[7]);

            scoutRegimentArrayList.add(scoutRegiment);
        }

        return scoutRegimentArrayList;
    }
}
