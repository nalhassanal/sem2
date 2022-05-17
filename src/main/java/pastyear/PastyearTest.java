package pastyear;
// add commentss
public class PastyearTest {
    public static void main(String[] args) {
        Stack raw = new Stack("Raw list");
//        part1(raw);

        Stack frontliners, others;
        frontliners = new Stack("Frontliners");
        others = new Stack("Others");
//        part2(raw, frontliners, others);

        Stack priority = new Stack("Vaccine Priority List");
        part3(raw, frontliners, others, priority);

    }

    public static void part1(Stack raw){
        raw.push("ali" , 32, "m", "doctor");
        raw.push("lisa" , 29, "f", "nurse");
        raw.push("tanaka" , 41);
        raw.push("ahmad" , 18, "m", "developer");
        raw.push("maria" , 20, "f", "accountant");
        raw.push("chong" , 70, "m", "lawyer");
        raw.push("raju" , 55, "m", "police");
        raw.push("alex" , 16, "m", "Business man");

        person katie = new person("Katie", 36, "f" , "teacher");

        raw.push(katie);
        raw.displayStack();
    }

    public static void part2(Stack raw, Stack frontliners, Stack others){
        if (raw.isEmpty())
            part1(raw);

        while (!raw.isEmpty()){
            person temp = raw.pop();
            if (temp.getFrontliner_status().equalsIgnoreCase("frontliner"))
                frontliners.push(temp);
            else
                others.push(temp);
        }

        raw.displayStack();
        frontliners.displayStack();
        others.displayStack();
    }

    public static void part3(Stack raw, Stack frontliners, Stack others, Stack priority){
        if (frontliners.isEmpty() && others.isEmpty())
            part2(raw, frontliners, others);

        sortStack(others);
        sortStack(frontliners);
        Stack temp = new Stack("Temp");
        while(!frontliners.isEmpty())
            temp.push(frontliners.pop());
        while(!others.isEmpty()){
            temp.push(others.pop());
        }

        while(!temp.isEmpty())
            priority.push(temp.pop());
        others.displayStack();
        frontliners.displayStack();
        priority.displayStack();
    }

    public static void sortedPush(Stack stack, person x){
        if (stack.isEmpty() || x.getAge() > stack.peek().getAge()){
            stack.push(x);
            return;
        }

        person temp = stack.pop();
        sortedPush(stack, x);

        stack.push(temp);
    }

    public static void sortStack(Stack stack){
        if (!stack.isEmpty()){
            person x = stack.pop();

            sortStack(stack);

            sortedPush(stack, x);
        }
    }

}
