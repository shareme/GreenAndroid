package com.github.shareme.greenandroid.materialdrawer.model;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.StringRes;
import android.view.View;
import android.widget.TextView;

import com.github.shareme.greenandroid.fastadapter.utils.ViewHolderFactory;
import com.github.shareme.greenandroid.materialdrawer.R;
import com.github.shareme.greenandroid.materialdrawer.holder.BadgeStyle;
import com.github.shareme.greenandroid.materialdrawer.holder.StringHolder;
import com.github.shareme.greenandroid.materialdrawer.model.interfaces.ColorfulBadgeable;

import java.util.List;

/**
 * Created by mikepenz on 03.02.15.
 */
public abstract class AbstractBadgeableDrawerItem<Item extends AbstractBadgeableDrawerItem> extends BaseDescribeableDrawerItem<Item, AbstractBadgeableDrawerItem.ViewHolder> implements ColorfulBadgeable<Item> {
    protected StringHolder mBadge;
    protected BadgeStyle mBadgeStyle = new BadgeStyle();

    //@Override
    @SuppressWarnings("unchecked")
    public Item withBadge(StringHolder badge) {
        this.mBadge = badge;
        return (Item) this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Item withBadge(String badge) {
        this.mBadge = new StringHolder(badge);
        return (Item) this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Item withBadge(@StringRes int badgeRes) {
        this.mBadge = new StringHolder(badgeRes);
        return (Item) this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Item withBadgeStyle(BadgeStyle badgeStyle) {
        this.mBadgeStyle = badgeStyle;
        return (Item) this;
    }

    public StringHolder getBadge() {
        return mBadge;
    }

    public BadgeStyle getBadgeStyle() {
        return mBadgeStyle;
    }

    @Override
    public int getType() {
        return R.id.material_drawer_item_primary;/*"PRIMARY_ITEM"*/
    }

    @Override
    @LayoutRes
    public int getLayoutRes() {
        return R.layout.material_drawer_item_primary;
    }

    @Override
    public void bindView(ViewHolder viewHolder, List payloads) {
        Context ctx = viewHolder.itemView.getContext();
        //bind the basic view parts
        bindViewHelper(viewHolder);

        //set the text for the badge or hide
        boolean badgeVisible = StringHolder.applyToOrHide(mBadge, viewHolder.badge);
        //style the badge if it is visible
        if (badgeVisible) {
            mBadgeStyle.style(viewHolder.badge, getTextColorStateList(getColor(ctx), getSelectedTextColor(ctx)));
            viewHolder.badgeContainer.setVisibility(View.VISIBLE);
        } else {
            viewHolder.badgeContainer.setVisibility(View.GONE);
        }

        //define the typeface for our textViews
        if (getTypeface() != null) {
            viewHolder.badge.setTypeface(getTypeface());
        }

        //call the onPostBindView method to trigger post bind view actions (like the listener to modify the item if required)
        onPostBindView(this, viewHolder.itemView);
    }

    @Override
    public ViewHolderFactory<ViewHolder> getFactory() {
        return new ItemFactory();
    }

    public static class ItemFactory implements ViewHolderFactory<ViewHolder> {
        public ViewHolder create(View v) {
            return new ViewHolder(v);
        }
    }

    public static class ViewHolder extends BaseViewHolder {
        private View badgeContainer;
        private TextView badge;

        public ViewHolder(View view) {
            super(view);
            this.badgeContainer = view.findViewById(R.id.material_drawer_badge_container);
            this.badge = (TextView) view.findViewById(R.id.material_drawer_badge);
        }
    }
}
