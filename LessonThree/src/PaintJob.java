public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4, 1.5));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        int bucketsNeeded = 0;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        } else {
            double area = width * height;
            bucketsNeeded = (int) Math.ceil(area / areaPerBucket);
            return bucketsNeeded - extraBuckets;
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        int bucketsNeeded = 0;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            double area = width * height;
            bucketsNeeded = (int) Math.ceil(area / areaPerBucket);
            return bucketsNeeded;
        }
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        int bucketsNeeded = 0;
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            bucketsNeeded = (int) Math.ceil(area / areaPerBucket);
            return bucketsNeeded;
        }
    }
}
