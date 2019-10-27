package id.ac.polinema.recyclerviewsangatsederhana.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import id.ac.polinema.recyclerviewsangatsederhana.Models.NightHero;
import id.ac.polinema.recyclerviewsangatsederhana.R;

public class NightHeroAdapter extends RecyclerView.Adapter<NightHeroAdapter.MyViewHolder> {

    public NightHeroAdapter(List<NightHero> heroList) {
        this.heroList = heroList;
    }

    List<NightHero> heroList;


    @NonNull
    @Override
    public NightHeroAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View nightHeroView = layoutInflater.inflate(R.layout.item_night_hero,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(nightHeroView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NightHeroAdapter.MyViewHolder holder, int position) {
        NightHero hero = heroList.get(position);
        holder.nightName.setText(hero.getNightName());
        Picasso.get().load(hero.getPhotoName())
                .placeholder(R.drawable.ic_launcher_background)
                .into(holder.imageContact);

    }

    @Override
    public int getItemCount() {
        return (heroList != null) ? heroList.size() : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView nightName;
        public ImageView imageContact;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nightName = itemView.findViewById(R.id.heroName);
            imageContact = itemView.findViewById(R.id.img_item_photo);

        }
    }
}
