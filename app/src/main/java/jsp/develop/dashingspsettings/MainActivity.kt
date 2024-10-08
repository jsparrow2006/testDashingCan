package jsp.develop.dashingspsettings

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.mengbo.mbCan.MBCanEngine
import com.mengbo.mbCan.defines.MBVehicleProperty

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val TEST_CAN_BUS = "TEST_CAN_BUS"


//        MBCanEngine.getInstance().canSetVehicleParam(MBVehicleProperty.eVEHICLE_PROPERTY_SUNSHADE_POS, 10);
        MBCanEngine.getInstance().getVersion(1)
        val qq = MBCanEngine.getInstance().getSubscribeDataList()
        Log.d(TEST_CAN_BUS, qq.toString())
        val names = MBVehicleProperty::class.java.enumConstants.map { it.name }
        Log.d(TEST_CAN_BUS, names.toString())
        Log.d(TEST_CAN_BUS, MBVehicleProperty.valueOf(names[5]).value.toString())
    }
}