package trackr.model.order;

import trackr.model.commons.Deadline;

/**
 * Represents an Order's deadline in the order list.
 * Guarantees: immutable; is valid as declared in {@link #isValidDeadline(String)}
 */
public class OrderDeadline extends Deadline {

    /**
     * Constructs a {@code OrderDeadline}.
     *
     * @param deadline A valid deadline.
     */
    public OrderDeadline(String deadline) {
        super(deadline, "Order");
    }
}
