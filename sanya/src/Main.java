
public class Main {
    public static class Boolean {
        public static void main(String[] args) {
            boolean parity = true;
            boolean stop = false;
            int count1 = 0;
            int count2 = 0;
            int distance = 10000;
            int time = 0;
            int man1speed = 8;
            int man2speed = 16;
            int dogspeed = 32;
            int man1distance = 0;
            int man2distance = 0;
            int man1time = 0;
            int man2time = 0;
            int dogtime = 0;
            int end = 0;
            for (; count1 == 0; time++) {
                man1time = time * man1speed;
                man2time = time * man2speed;
                dogtime = dogtime + dogspeed;
                man1distance = distance - man1time;
                man2distance = distance - man2time;
                end = man2distance - man1time;
                parity = count1 % 2 == 0;
                stop = end < 5;
                System.out.println("man1time = " + man1time);
                System.out.println("man2time = " + man2time);
                System.out.println("dogtime = " + dogtime);
                System.out.println("man1distance = " + man1distance);
                System.out.println("man2distance = " + man2distance);
                System.out.println("end = " + end);
                System.out.println("time = " + time);
                System.out.println("count = " + count1);;
                if (dogtime >= man2distance) {
                    count1++;
                    break;
                }
            }
            for (; ;time++) {
                if (!parity && !stop) {
                    man1time = time * man1speed;
                    man2time = time * man2speed;
                    dogtime = dogtime - dogspeed;
                    man1distance = distance - man1time;
                    man2distance = distance - man2time;
                    end = man2distance - man1time;
                    parity = count1 % 2 == 0;
                    stop = end < 5;
                    System.out.println("man1time = " + man1time);
                    System.out.println("man2time = " + man2time);
                    System.out.println("dogtime = " + dogtime);
                    System.out.println("man1distance = " + man1distance);
                    System.out.println("man2distance = " + man2distance);
                    System.out.println("end = " + end);
                    System.out.println("time = " + time);
                    System.out.println("count = " + count1);
                    if (dogtime <= man1time) {
                        count1++;
                    }
                    if (stop) {
                        System.out.println("Собака достигла цели столько раз = " + count2);
                        System.out.println("Время = " + time);
                        return;
                    }
                }
                else if(parity && !stop) {
                    man1time = time * man1speed;
                    man2time = time * man2speed;
                    dogtime = dogtime + dogspeed;
                    man1distance = distance - man1time;
                    man2distance = distance - man2time;
                    end = man2distance - man1time;
                    parity = count2 % 2 == 0;
                    stop = end < 5;
                    System.out.println("man1time = " + man1time);
                    System.out.println("man2time = " + man2time);
                    System.out.println("dogtime = " + dogtime);
                    System.out.println("man1distance = " + man1distance);
                    System.out.println("man2distance = " + man2distance);
                    System.out.println("end = " + end);
                    System.out.println("time = " + time);
                    System.out.println("count = " + count2);
                    if (dogtime >= man2distance) {
                        count2++;
                    }
                    if (stop) {
                        count2 = count2 + count1;
                        System.out.println("Собака достигла цели столько раз = " + count2);
                        System.out.println("Время = " + time);
                        return;
                    }
                }
            }
        }

    }
}






















