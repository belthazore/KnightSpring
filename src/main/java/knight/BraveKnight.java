package knight;

import static java.lang.System.out;





public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
        out.println("test");
    }

    // embark - приступить
    // Внедрение сценария подвига
    public void embarkOnQuest() throws QuestException {
        quest.embark();
    }

    public void sayName() {
        out.println("My name is Joe !");
    }


}