package trackr.model.order;

import trackr.model.commons.Name;

/**
 * Represents an Order's name in the order list.
 * Guaruntees: immutable; is valid as declared in {@link #isValidName(String)}
 */
public class OrderName extends Name {

    public static final String MESSAGE_CONSTRAINTS =
            "Order names should only contain alphanumeric characters and spaces, and it should not be blank";

    /**
     * Constructs a {@code OrderName}.
     *
     * @param orderName A valid order name.
     */
    public OrderName(String orderName) {
        super(orderName, "Order");
    }
}
