package rsql;

import rsql.select.RsqlSelect;
import rsql.where.RsqlWhere;

import static java.time.LocalDateTime.now;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Start time " + now().toString());
        String inputFile = "test_where.rsql";
        if ( args.length>0 ) inputFile = args[0];

        RsqlWhere parser = new RsqlWhere();

        String result = parser.parseAsText(inputFile);
        System.out.println("Where = " + result);

        RsqlSelect selParser = new RsqlSelect();
        String result2 = selParser.parseAsText("test_select.rsql");
        System.out.println("Select = "+ result2);
        System.out.println("Paths = " + selParser.paths());
        System.out.println("End time " + now().toString());
    }

}
