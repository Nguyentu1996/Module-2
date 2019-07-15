import java.util.Date;

public class StopWatch {
        private long startTime;
        private long endTime;
        private long elapsedTime;
        public StopWatch() {
        }

        public StopWatch(final Date startTime, final Date endTime){
            this.startTime = startTime.getTime();
            this.endTime = endTime.getTime();
            this.elapsedTime = this.endTime - this.startTime;
        }

        public long getStartTime() {
            return this.startTime = System.currentTimeMillis();
        }

        public long getEndTime() {
            return endTime = System.currentTimeMillis();
        }

        public long getElapsedTime() {
            return (elapsedTime = endTime - startTime);
        }

    public static void main(String[] args) {
            StopWatch watch = new StopWatch();
        System.out.println("thời gian bắt đầu "+watch.getStartTime()+"millisecond");
        System.out.println("thời gian kết thúc "+watch.getEndTime()+"millisecond");
        System.out.println("thời gian thực thi thuật toán "+watch.getElapsedTime()+"millisecond");
    }
}
