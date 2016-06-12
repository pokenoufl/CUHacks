package cuhacks.cuhacks1;

        import android.location.LocationManager;
        import android.support.v4.app.FragmentActivity;
        import android.os.Bundle;

        import com.google.android.gms.maps.CameraUpdateFactory;
        import com.google.android.gms.maps.GoogleMap;
        import com.google.android.gms.maps.OnMapReadyCallback;
        import com.google.android.gms.maps.SupportMapFragment;
        import com.google.android.gms.maps.UiSettings;
        import com.google.android.gms.maps.model.LatLng;
        import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);



    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(37.32, -122.03);

        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        mMap.addMarker(new MarkerOptions().position(new LatLng(37.363007, -121.904068)).title("Next Door Solutions To Domestic Violence").snippet("234 E Gish Rd #200, San Jose, CA 95112"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(37.337731, -121.894176 )).title("Domestic Violence Intervention").snippet("111 N Market St, San Jose, CA 95113"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(37.374239, -122.029505)).title("YWCA Silicon Valley").snippet("375 S 3rd St, San Jose, CA 95112"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(37.372462, -122.038209)).title("A Turning Point-Sunnyvale").snippet("505 W Olive Ave, Sunnyvale, CA 94086"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(37.558439, -121.979534)).title("Safe Alternatives To Violent Environments").snippet("1900 Mowry Ave #201, Fremont, CA 94538"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(37.546624, -122.306173)).title("Cora").snippet("1633 Old Bayshore Hwy # 280, Burlingame, CA 94010"));


        UiSettings mapSettings;
        mapSettings = mMap.getUiSettings();
        float maxZoom = 10.0f;
        mMap.animateCamera(CameraUpdateFactory.zoomTo(maxZoom));

        mapSettings.setZoomControlsEnabled(true);
    }
}
