package org.onehippo.forge.externalresource.gallery.columns;

import javax.jcr.Node;
import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.markup.html.IHeaderContributor;
import org.apache.wicket.model.Model;
import org.hippoecm.frontend.plugins.standards.ClassResourceModel;
import org.hippoecm.frontend.plugins.standards.list.IListColumnProvider;
import org.hippoecm.frontend.plugins.standards.list.ListColumn;
import org.hippoecm.frontend.plugins.standards.list.comparators.NameComparator;
import org.hippoecm.frontend.plugins.standards.list.resolvers.EmptyRenderer;
import org.onehippo.forge.externalresource.gallery.icons.ImageGalleryIconModifier;

public class FallbackVideoGalleryListColumnProvider implements IListColumnProvider {
    @SuppressWarnings("unused")
    private static final String SVN_ID = "$Id: ";
    private static final long serialVersionUID = -5050571961449921762L;

    public IHeaderContributor getHeaderContributor() {
        return null;
    }

    public List<ListColumn<Node>> getColumns() {
        List<ListColumn<Node>> columns = new ArrayList<ListColumn<Node>>();

        ListColumn<Node> column = new ListColumn<Node>(new Model<>(""), null);
        column.setRenderer(EmptyRenderer.getInstance());
        column.setAttributeModifier(new ImageGalleryIconModifier());
        column.setCssClass("video-gallery-icon");
        columns.add(column);

        column = new ListColumn<>(new ClassResourceModel("video-name", Translations.class), "name");
        column.setComparator(NameComparator.getInstance());
        column.setCssClass("video-name");
        columns.add(column);

        return columns;
    }

    public List<ListColumn<Node>> getExpandedColumns() {
        return getColumns();
    }
}
