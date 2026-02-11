package org.ies.tierno.myTree;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Node<T> {
    private final Double value;
    private final Node<T> lesser;
    private final Node<T> greater;
}
