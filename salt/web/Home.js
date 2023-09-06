function searchModel() {
    var nama = document.getElementById("nama").value;
    fetch("/api/model/search?nama=" + nama)
        .then(response => response.json())
        .then(data => {
            var tbody = document.querySelector("#modelTable tbody");
            tbody.innerHTML = "";

            data.forEach(model => {
                var row = tbody.insertRow();
                row.insertCell(0).innerHTML = konsumen.id;
                row.insertCell(1).innerHTML = konsumen.nama;
                row.insertCell(2).innerHTML = konsumen.alamat;
                row.insertCell(3).innerHTML = konsumen.kota;
                row.insertCell(4).innerHTML = konsumen.provinsi;
                row.insertCell(5).innerHTML = konsumen.tglRegistrasi;
                row.insertCell(6).innerHTML = konsumen.status;
            });
        });
}