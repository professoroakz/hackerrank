public Difference(int[] elems) {
    this.elements = elems;
}

public void computeDifference() {
    Arrays.sort(elements);
    this.maximumDifference = Math.abs(elements[elements.length - 1] - elements[0]);
}
