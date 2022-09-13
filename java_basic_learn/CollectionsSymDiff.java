

public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
    Set<T> symmetricDiff = new HashSet<T>(set1);
    symmetricDiff.addAll(set2);
    Set<T> tmp = new HashSet<T>(set1);
    tmp.retainAll(set2);
    symmetricDiff.removeAll(tmp);
    return symmetricDiff;
}