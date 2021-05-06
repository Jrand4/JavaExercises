package Exercises.Java;

public class Main {

    public static void main(String[] args) {
        System.out.println(getBucketCount(0.75,0.75,0.5));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0.0d || height <= 0.0d || areaPerBucket <= 0.0d || extraBuckets < 0) return -1;
        return (int)Math.ceil((width * height) / areaPerBucket) - extraBuckets;
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        return getBucketCount(width,height,areaPerBucket,0);
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0) return -1;
        return (int)Math.ceil(area / areaPerBucket);
    }
}