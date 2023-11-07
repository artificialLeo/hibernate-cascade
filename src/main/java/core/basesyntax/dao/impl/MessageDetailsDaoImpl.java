package core.basesyntax.dao.impl;

import core.basesyntax.dao.MessageDetailsDao;
import core.basesyntax.model.MessageDetails;
import org.hibernate.SessionFactory;

public class MessageDetailsDaoImpl
        extends AbstractDao<MessageDetails>
        implements MessageDetailsDao {
    public MessageDetailsDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory, MessageDetails.class);
    }

    @Override
    public MessageDetails create(MessageDetails entity) {
        return super.create(entity);
    }

    @Override
    public MessageDetails get(Long id) {
        return super.get(id);
    }
}
