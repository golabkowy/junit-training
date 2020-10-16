public class ClassB implements Comparable<ClassB> {
    public String version;

    public static String lastSnapshotVersion;
    public static String lastNoSnapshotVersion;

    public ClassB(String version) {
        if (version == null) throw new IllegalArgumentException("'version' must not be null");
        if (!version.matches("\\d+(\\.\\d+){0,2}(-SNAPSHOT)?"))
            throw new IllegalArgumentException("'version' must match: 'major.minor.patch(-SNAPSHOT)'!");
        else this.version = version;

        if (isSnapshot()) lastSnapshotVersion = version;
        else lastNoSnapshotVersion = version;

    }

    public boolean isSnapshot() {
        return this.version.contains("SNAPSHOT");
    }

    @Override
    public int compareTo(ClassB o) {

        if (o == null) throw new IllegalArgumentException("'other' must not be null!");

        String tempThis = this.version;
        String tempO = o.version;

        Integer numericVersionThis = Integer.parseInt(tempThis.replace("-SNAPSHOT", "").replaceAll("\\.", ""));
        Integer numericVersionO = Integer.parseInt(tempO.replace("-SNAPSHOT", "").replaceAll("\\.", ""));

        return numericVersionThis.compareTo(numericVersionO);
    }
}
