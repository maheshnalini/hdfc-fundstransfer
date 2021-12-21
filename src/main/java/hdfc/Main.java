package hdfc;

import java.util.List;
import com.google.common.collect.Lists;
import com.ontology2.centipede.shell.CentipedeShell;

public class Main extends CentipedeShell {

    public List<String> getApplicationContextPath() {
        String resourceDir="hdfc";
        return Lists.newArrayList(resourceDir.replace('.','/')+ "/applicationContext.xml");
    }

    @Override
    public String getShellName() {
        return "fundstransfer";
    }

    public static void main(String[] args) {
        new Main().run(args);
    }
}
