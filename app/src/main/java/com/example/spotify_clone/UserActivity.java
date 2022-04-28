package com.example.spotify_clone;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Adapter.PlaylistAdapter;
import Model.Playlist;

public class UserActivity extends AppCompatActivity {

    private RecyclerView rcvPlaylist;
    private PlaylistAdapter playlistAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        rcvPlaylist = findViewById(R.id.activityUser_listPlaylistRv);
        playlistAdapter = new PlaylistAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvPlaylist.setLayoutManager(linearLayoutManager);

        playlistAdapter.setData(getListUser());
        rcvPlaylist.setAdapter(playlistAdapter);
    }
    private List<Playlist> getListUser() {
        List<Playlist> list = new ArrayList<>();

        list.add(new Playlist(R.drawable.playlist, "My playlist", "Hoan"));
        list.add(new Playlist(R.drawable.playlist, "My first play", "Tien"));
        list.add(new Playlist(R.drawable.playlist, "dancin", "Dat"));
        list.add(new Playlist(R.drawable.playlist, "EDM", "Luan"));


        return list;
    }
}
